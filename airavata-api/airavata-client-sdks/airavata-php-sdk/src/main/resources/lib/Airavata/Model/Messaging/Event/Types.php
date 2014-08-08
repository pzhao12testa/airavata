<?php
namespace Airavata\Model\Messaging\Event;

/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;


class ExperimentStatusChangeEvent {
  static $_TSPEC;

  public $state = null;
  public $experimentId = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'state',
          'type' => TType::I32,
          ),
        2 => array(
          'var' => 'experimentId',
          'type' => TType::STRING,
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['state'])) {
        $this->state = $vals['state'];
      }
      if (isset($vals['experimentId'])) {
        $this->experimentId = $vals['experimentId'];
      }
    }
  }

  public function getName() {
    return 'ExperimentStatusChangeEvent';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::I32) {
            $xfer += $input->readI32($this->state);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->experimentId);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('ExperimentStatusChangeEvent');
    if ($this->state !== null) {
      $xfer += $output->writeFieldBegin('state', TType::I32, 1);
      $xfer += $output->writeI32($this->state);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->experimentId !== null) {
      $xfer += $output->writeFieldBegin('experimentId', TType::STRING, 2);
      $xfer += $output->writeString($this->experimentId);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

class WorkflowIdentity {
  static $_TSPEC;

  public $workflowNodeId = null;
  public $experimentId = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'workflowNodeId',
          'type' => TType::STRING,
          ),
        2 => array(
          'var' => 'experimentId',
          'type' => TType::STRING,
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['workflowNodeId'])) {
        $this->workflowNodeId = $vals['workflowNodeId'];
      }
      if (isset($vals['experimentId'])) {
        $this->experimentId = $vals['experimentId'];
      }
    }
  }

  public function getName() {
    return 'WorkflowIdentity';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->workflowNodeId);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->experimentId);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('WorkflowIdentity');
    if ($this->workflowNodeId !== null) {
      $xfer += $output->writeFieldBegin('workflowNodeId', TType::STRING, 1);
      $xfer += $output->writeString($this->workflowNodeId);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->experimentId !== null) {
      $xfer += $output->writeFieldBegin('experimentId', TType::STRING, 2);
      $xfer += $output->writeString($this->experimentId);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

class WorkflowNodeStatusChangeEvent {
  static $_TSPEC;

  public $state = null;
  public $workflowNodeIdentity = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'state',
          'type' => TType::I32,
          ),
        2 => array(
          'var' => 'workflowNodeIdentity',
          'type' => TType::STRUCT,
          'class' => '\Airavata\Model\Messaging\Event\WorkflowIdentity',
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['state'])) {
        $this->state = $vals['state'];
      }
      if (isset($vals['workflowNodeIdentity'])) {
        $this->workflowNodeIdentity = $vals['workflowNodeIdentity'];
      }
    }
  }

  public function getName() {
    return 'WorkflowNodeStatusChangeEvent';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::I32) {
            $xfer += $input->readI32($this->state);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::STRUCT) {
            $this->workflowNodeIdentity = new \Airavata\Model\Messaging\Event\WorkflowIdentity();
            $xfer += $this->workflowNodeIdentity->read($input);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('WorkflowNodeStatusChangeEvent');
    if ($this->state !== null) {
      $xfer += $output->writeFieldBegin('state', TType::I32, 1);
      $xfer += $output->writeI32($this->state);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->workflowNodeIdentity !== null) {
      if (!is_object($this->workflowNodeIdentity)) {
        throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
      }
      $xfer += $output->writeFieldBegin('workflowNodeIdentity', TType::STRUCT, 2);
      $xfer += $this->workflowNodeIdentity->write($output);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

class TaskIdentity {
  static $_TSPEC;

  public $taskId = null;
  public $workflowNodeId = null;
  public $experimentId = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'taskId',
          'type' => TType::STRING,
          ),
        2 => array(
          'var' => 'workflowNodeId',
          'type' => TType::STRING,
          ),
        3 => array(
          'var' => 'experimentId',
          'type' => TType::STRING,
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['taskId'])) {
        $this->taskId = $vals['taskId'];
      }
      if (isset($vals['workflowNodeId'])) {
        $this->workflowNodeId = $vals['workflowNodeId'];
      }
      if (isset($vals['experimentId'])) {
        $this->experimentId = $vals['experimentId'];
      }
    }
  }

  public function getName() {
    return 'TaskIdentity';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->taskId);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->workflowNodeId);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 3:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->experimentId);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('TaskIdentity');
    if ($this->taskId !== null) {
      $xfer += $output->writeFieldBegin('taskId', TType::STRING, 1);
      $xfer += $output->writeString($this->taskId);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->workflowNodeId !== null) {
      $xfer += $output->writeFieldBegin('workflowNodeId', TType::STRING, 2);
      $xfer += $output->writeString($this->workflowNodeId);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->experimentId !== null) {
      $xfer += $output->writeFieldBegin('experimentId', TType::STRING, 3);
      $xfer += $output->writeString($this->experimentId);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

class TaskStatusChangeEvent {
  static $_TSPEC;

  public $state = null;
  public $taskIdentity = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'state',
          'type' => TType::I32,
          ),
        2 => array(
          'var' => 'taskIdentity',
          'type' => TType::STRUCT,
          'class' => '\Airavata\Model\Messaging\Event\TaskIdentity',
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['state'])) {
        $this->state = $vals['state'];
      }
      if (isset($vals['taskIdentity'])) {
        $this->taskIdentity = $vals['taskIdentity'];
      }
    }
  }

  public function getName() {
    return 'TaskStatusChangeEvent';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::I32) {
            $xfer += $input->readI32($this->state);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::STRUCT) {
            $this->taskIdentity = new \Airavata\Model\Messaging\Event\TaskIdentity();
            $xfer += $this->taskIdentity->read($input);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('TaskStatusChangeEvent');
    if ($this->state !== null) {
      $xfer += $output->writeFieldBegin('state', TType::I32, 1);
      $xfer += $output->writeI32($this->state);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->taskIdentity !== null) {
      if (!is_object($this->taskIdentity)) {
        throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
      }
      $xfer += $output->writeFieldBegin('taskIdentity', TType::STRUCT, 2);
      $xfer += $this->taskIdentity->write($output);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

class JobIdentity {
  static $_TSPEC;

  public $jobId = null;
  public $taskId = null;
  public $workflowNodeId = null;
  public $experimentId = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'jobId',
          'type' => TType::STRING,
          ),
        2 => array(
          'var' => 'taskId',
          'type' => TType::STRING,
          ),
        3 => array(
          'var' => 'workflowNodeId',
          'type' => TType::STRING,
          ),
        4 => array(
          'var' => 'experimentId',
          'type' => TType::STRING,
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['jobId'])) {
        $this->jobId = $vals['jobId'];
      }
      if (isset($vals['taskId'])) {
        $this->taskId = $vals['taskId'];
      }
      if (isset($vals['workflowNodeId'])) {
        $this->workflowNodeId = $vals['workflowNodeId'];
      }
      if (isset($vals['experimentId'])) {
        $this->experimentId = $vals['experimentId'];
      }
    }
  }

  public function getName() {
    return 'JobIdentity';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->jobId);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->taskId);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 3:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->workflowNodeId);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 4:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->experimentId);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('JobIdentity');
    if ($this->jobId !== null) {
      $xfer += $output->writeFieldBegin('jobId', TType::STRING, 1);
      $xfer += $output->writeString($this->jobId);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->taskId !== null) {
      $xfer += $output->writeFieldBegin('taskId', TType::STRING, 2);
      $xfer += $output->writeString($this->taskId);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->workflowNodeId !== null) {
      $xfer += $output->writeFieldBegin('workflowNodeId', TType::STRING, 3);
      $xfer += $output->writeString($this->workflowNodeId);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->experimentId !== null) {
      $xfer += $output->writeFieldBegin('experimentId', TType::STRING, 4);
      $xfer += $output->writeString($this->experimentId);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

class JobMonitor {
  static $_TSPEC;

  public $username = null;
  public $jobStartedTime = null;
  public $lastMonitoredTime = null;
  public $hostId = null;
  public $parameters = null;
  public $jobName = null;
  public $failedCount = 0;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'username',
          'type' => TType::STRING,
          ),
        2 => array(
          'var' => 'jobStartedTime',
          'type' => TType::I64,
          ),
        3 => array(
          'var' => 'lastMonitoredTime',
          'type' => TType::I64,
          ),
        4 => array(
          'var' => 'hostId',
          'type' => TType::STRING,
          ),
        5 => array(
          'var' => 'parameters',
          'type' => TType::MAP,
          'ktype' => TType::STRING,
          'vtype' => TType::STRING,
          'key' => array(
            'type' => TType::STRING,
          ),
          'val' => array(
            'type' => TType::STRING,
            ),
          ),
        6 => array(
          'var' => 'jobName',
          'type' => TType::STRING,
          ),
        7 => array(
          'var' => 'failedCount',
          'type' => TType::I32,
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['username'])) {
        $this->username = $vals['username'];
      }
      if (isset($vals['jobStartedTime'])) {
        $this->jobStartedTime = $vals['jobStartedTime'];
      }
      if (isset($vals['lastMonitoredTime'])) {
        $this->lastMonitoredTime = $vals['lastMonitoredTime'];
      }
      if (isset($vals['hostId'])) {
        $this->hostId = $vals['hostId'];
      }
      if (isset($vals['parameters'])) {
        $this->parameters = $vals['parameters'];
      }
      if (isset($vals['jobName'])) {
        $this->jobName = $vals['jobName'];
      }
      if (isset($vals['failedCount'])) {
        $this->failedCount = $vals['failedCount'];
      }
    }
  }

  public function getName() {
    return 'JobMonitor';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->username);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::I64) {
            $xfer += $input->readI64($this->jobStartedTime);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 3:
          if ($ftype == TType::I64) {
            $xfer += $input->readI64($this->lastMonitoredTime);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 4:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->hostId);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 5:
          if ($ftype == TType::MAP) {
            $this->parameters = array();
            $_size0 = 0;
            $_ktype1 = 0;
            $_vtype2 = 0;
            $xfer += $input->readMapBegin($_ktype1, $_vtype2, $_size0);
            for ($_i4 = 0; $_i4 < $_size0; ++$_i4)
            {
              $key5 = '';
              $val6 = '';
              $xfer += $input->readString($key5);
              $xfer += $input->readString($val6);
              $this->parameters[$key5] = $val6;
            }
            $xfer += $input->readMapEnd();
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 6:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->jobName);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 7:
          if ($ftype == TType::I32) {
            $xfer += $input->readI32($this->failedCount);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('JobMonitor');
    if ($this->username !== null) {
      $xfer += $output->writeFieldBegin('username', TType::STRING, 1);
      $xfer += $output->writeString($this->username);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->jobStartedTime !== null) {
      $xfer += $output->writeFieldBegin('jobStartedTime', TType::I64, 2);
      $xfer += $output->writeI64($this->jobStartedTime);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->lastMonitoredTime !== null) {
      $xfer += $output->writeFieldBegin('lastMonitoredTime', TType::I64, 3);
      $xfer += $output->writeI64($this->lastMonitoredTime);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->hostId !== null) {
      $xfer += $output->writeFieldBegin('hostId', TType::STRING, 4);
      $xfer += $output->writeString($this->hostId);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->parameters !== null) {
      if (!is_array($this->parameters)) {
        throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
      }
      $xfer += $output->writeFieldBegin('parameters', TType::MAP, 5);
      {
        $output->writeMapBegin(TType::STRING, TType::STRING, count($this->parameters));
        {
          foreach ($this->parameters as $kiter7 => $viter8)
          {
            $xfer += $output->writeString($kiter7);
            $xfer += $output->writeString($viter8);
          }
        }
        $output->writeMapEnd();
      }
      $xfer += $output->writeFieldEnd();
    }
    if ($this->jobName !== null) {
      $xfer += $output->writeFieldBegin('jobName', TType::STRING, 6);
      $xfer += $output->writeString($this->jobName);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->failedCount !== null) {
      $xfer += $output->writeFieldBegin('failedCount', TType::I32, 7);
      $xfer += $output->writeI32($this->failedCount);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

class JobStatusChangeEvent {
  static $_TSPEC;

  public $state = null;
  public $jobIdentity = null;
  public $jobMonitor = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'state',
          'type' => TType::I32,
          ),
        2 => array(
          'var' => 'jobIdentity',
          'type' => TType::STRUCT,
          'class' => '\Airavata\Model\Messaging\Event\JobIdentity',
          ),
        3 => array(
          'var' => 'jobMonitor',
          'type' => TType::STRUCT,
          'class' => '\Airavata\Model\Messaging\Event\JobMonitor',
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['state'])) {
        $this->state = $vals['state'];
      }
      if (isset($vals['jobIdentity'])) {
        $this->jobIdentity = $vals['jobIdentity'];
      }
      if (isset($vals['jobMonitor'])) {
        $this->jobMonitor = $vals['jobMonitor'];
      }
    }
  }

  public function getName() {
    return 'JobStatusChangeEvent';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::I32) {
            $xfer += $input->readI32($this->state);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::STRUCT) {
            $this->jobIdentity = new \Airavata\Model\Messaging\Event\JobIdentity();
            $xfer += $this->jobIdentity->read($input);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 3:
          if ($ftype == TType::STRUCT) {
            $this->jobMonitor = new \Airavata\Model\Messaging\Event\JobMonitor();
            $xfer += $this->jobMonitor->read($input);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('JobStatusChangeEvent');
    if ($this->state !== null) {
      $xfer += $output->writeFieldBegin('state', TType::I32, 1);
      $xfer += $output->writeI32($this->state);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->jobIdentity !== null) {
      if (!is_object($this->jobIdentity)) {
        throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
      }
      $xfer += $output->writeFieldBegin('jobIdentity', TType::STRUCT, 2);
      $xfer += $this->jobIdentity->write($output);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->jobMonitor !== null) {
      if (!is_object($this->jobMonitor)) {
        throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
      }
      $xfer += $output->writeFieldBegin('jobMonitor', TType::STRUCT, 3);
      $xfer += $this->jobMonitor->write($output);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}


