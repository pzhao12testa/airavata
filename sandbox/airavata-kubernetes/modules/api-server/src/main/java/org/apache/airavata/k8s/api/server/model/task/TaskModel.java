package org.apache.airavata.k8s.api.server.model.task;

import org.apache.airavata.k8s.api.server.model.commons.ErrorModel;
import org.apache.airavata.k8s.api.server.model.job.JobModel;
import org.apache.airavata.k8s.api.server.model.process.ProcessModel;

import javax.persistence.*;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TODO: Class level comments please
 *
 * @author dimuthu
 * @since 1.0.0-SNAPSHOT
 */
@Entity
@Table(name = "TASK_MODEL")
public class TaskModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private TaskTypes taskType;

    @ManyToOne
    private ProcessModel parentProcess;

    private long creationTime;
    private long lastUpdateTime;
    private int orderIndex;

    @OneToMany
    private List<TaskStatus> taskStatuses = new ArrayList<>();

    private String taskDetail;

    @OneToMany
    private List<ErrorModel> taskErrors = new ArrayList<>();

    @OneToMany
    private List<JobModel> jobs = new ArrayList<>();

    @OneToMany(mappedBy = "taskModel", cascade = CascadeType.ALL)
    private List<TaskParam> taskParams = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public TaskTypes getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskTypes taskType) {
        this.taskType = taskType;
    }

    public ProcessModel getParentProcess() {
        return parentProcess;
    }

    public void setParentProcess(ProcessModel parentProcess) {
        this.parentProcess = parentProcess;
    }

    public long getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(long creationTime) {
        this.creationTime = creationTime;
    }

    public long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public List<TaskStatus> getTaskStatuses() {
        return taskStatuses;
    }

    public void setTaskStatuses(List<TaskStatus> taskStatuses) {
        this.taskStatuses = taskStatuses;
    }

    public String getTaskDetail() {
        return taskDetail;
    }

    public void setTaskDetail(String taskDetail) {
        this.taskDetail = taskDetail;
    }

    public List<ErrorModel> getTaskErrors() {
        return taskErrors;
    }

    public void setTaskErrors(List<ErrorModel> taskErrors) {
        this.taskErrors = taskErrors;
    }

    public List<JobModel> getJobs() {
        return jobs;
    }

    public void setJobs(List<JobModel> jobs) {
        this.jobs = jobs;
    }

    public List<TaskParam> getTaskParams() {
        return taskParams;
    }

    public TaskModel setTaskParams(List<TaskParam> taskParams) {
        this.taskParams = taskParams;
        return this;
    }

    public int getOrderIndex() {
        return orderIndex;
    }

    public TaskModel setOrderIndex(int orderIndex) {
        this.orderIndex = orderIndex;
        return this;
    }

    public enum TaskTypes {
        ENV_SETUP(0),
        INGRESS_DATA_STAGING(1),
        EGRESS_DATA_STAGING(2),
        JOB_SUBMISSION(3),
        ENV_CLEANUP(4),
        MONITORING(5),
        OUTPUT_FETCHING(6);

        private static Map<Integer, TaskTypes> map = new HashMap<>();

        static {
            for (TaskTypes taskType : TaskTypes.values()) {
                map.put(taskType.value, taskType);
            }
        }
        private final int value;

        public static TaskTypes valueOf(int taskType) {
            return map.get(taskType);
        }

        private TaskTypes(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

}
