/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.sharing.registry.models;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-10-12")
public class EntityType implements org.apache.thrift.TBase<EntityType, EntityType._Fields>, java.io.Serializable, Cloneable, Comparable<EntityType> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("EntityType");

  private static final org.apache.thrift.protocol.TField ENTITY_TYPE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("entityTypeId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField DOMAIN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("domainId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField DESCRIPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("description", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField CREATED_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("createdTime", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField UPDATED_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("updatedTime", org.apache.thrift.protocol.TType.I64, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new EntityTypeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new EntityTypeTupleSchemeFactory());
  }

  public String entityTypeId; // optional
  public String domainId; // optional
  public String name; // optional
  public String description; // optional
  public long createdTime; // optional
  public long updatedTime; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ENTITY_TYPE_ID((short)1, "entityTypeId"),
    DOMAIN_ID((short)2, "domainId"),
    NAME((short)3, "name"),
    DESCRIPTION((short)4, "description"),
    CREATED_TIME((short)5, "createdTime"),
    UPDATED_TIME((short)6, "updatedTime");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ENTITY_TYPE_ID
          return ENTITY_TYPE_ID;
        case 2: // DOMAIN_ID
          return DOMAIN_ID;
        case 3: // NAME
          return NAME;
        case 4: // DESCRIPTION
          return DESCRIPTION;
        case 5: // CREATED_TIME
          return CREATED_TIME;
        case 6: // UPDATED_TIME
          return UPDATED_TIME;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __CREATEDTIME_ISSET_ID = 0;
  private static final int __UPDATEDTIME_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ENTITY_TYPE_ID,_Fields.DOMAIN_ID,_Fields.NAME,_Fields.DESCRIPTION,_Fields.CREATED_TIME,_Fields.UPDATED_TIME};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ENTITY_TYPE_ID, new org.apache.thrift.meta_data.FieldMetaData("entityTypeId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DOMAIN_ID, new org.apache.thrift.meta_data.FieldMetaData("domainId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DESCRIPTION, new org.apache.thrift.meta_data.FieldMetaData("description", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CREATED_TIME, new org.apache.thrift.meta_data.FieldMetaData("createdTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.UPDATED_TIME, new org.apache.thrift.meta_data.FieldMetaData("updatedTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(EntityType.class, metaDataMap);
  }

  public EntityType() {
    this.entityTypeId = "DO_NOT_SET_AT_CLIENTS_ID";

  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public EntityType(EntityType other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetEntityTypeId()) {
      this.entityTypeId = other.entityTypeId;
    }
    if (other.isSetDomainId()) {
      this.domainId = other.domainId;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetDescription()) {
      this.description = other.description;
    }
    this.createdTime = other.createdTime;
    this.updatedTime = other.updatedTime;
  }

  public EntityType deepCopy() {
    return new EntityType(this);
  }

  @Override
  public void clear() {
    this.entityTypeId = "DO_NOT_SET_AT_CLIENTS_ID";

    this.domainId = null;
    this.name = null;
    this.description = null;
    setCreatedTimeIsSet(false);
    this.createdTime = 0;
    setUpdatedTimeIsSet(false);
    this.updatedTime = 0;
  }

  public String getEntityTypeId() {
    return this.entityTypeId;
  }

  public EntityType setEntityTypeId(String entityTypeId) {
    this.entityTypeId = entityTypeId;
    return this;
  }

  public void unsetEntityTypeId() {
    this.entityTypeId = null;
  }

  /** Returns true if field entityTypeId is set (has been assigned a value) and false otherwise */
  public boolean isSetEntityTypeId() {
    return this.entityTypeId != null;
  }

  public void setEntityTypeIdIsSet(boolean value) {
    if (!value) {
      this.entityTypeId = null;
    }
  }

  public String getDomainId() {
    return this.domainId;
  }

  public EntityType setDomainId(String domainId) {
    this.domainId = domainId;
    return this;
  }

  public void unsetDomainId() {
    this.domainId = null;
  }

  /** Returns true if field domainId is set (has been assigned a value) and false otherwise */
  public boolean isSetDomainId() {
    return this.domainId != null;
  }

  public void setDomainIdIsSet(boolean value) {
    if (!value) {
      this.domainId = null;
    }
  }

  public String getName() {
    return this.name;
  }

  public EntityType setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getDescription() {
    return this.description;
  }

  public EntityType setDescription(String description) {
    this.description = description;
    return this;
  }

  public void unsetDescription() {
    this.description = null;
  }

  /** Returns true if field description is set (has been assigned a value) and false otherwise */
  public boolean isSetDescription() {
    return this.description != null;
  }

  public void setDescriptionIsSet(boolean value) {
    if (!value) {
      this.description = null;
    }
  }

  public long getCreatedTime() {
    return this.createdTime;
  }

  public EntityType setCreatedTime(long createdTime) {
    this.createdTime = createdTime;
    setCreatedTimeIsSet(true);
    return this;
  }

  public void unsetCreatedTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CREATEDTIME_ISSET_ID);
  }

  /** Returns true if field createdTime is set (has been assigned a value) and false otherwise */
  public boolean isSetCreatedTime() {
    return EncodingUtils.testBit(__isset_bitfield, __CREATEDTIME_ISSET_ID);
  }

  public void setCreatedTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CREATEDTIME_ISSET_ID, value);
  }

  public long getUpdatedTime() {
    return this.updatedTime;
  }

  public EntityType setUpdatedTime(long updatedTime) {
    this.updatedTime = updatedTime;
    setUpdatedTimeIsSet(true);
    return this;
  }

  public void unsetUpdatedTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __UPDATEDTIME_ISSET_ID);
  }

  /** Returns true if field updatedTime is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdatedTime() {
    return EncodingUtils.testBit(__isset_bitfield, __UPDATEDTIME_ISSET_ID);
  }

  public void setUpdatedTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __UPDATEDTIME_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ENTITY_TYPE_ID:
      if (value == null) {
        unsetEntityTypeId();
      } else {
        setEntityTypeId((String)value);
      }
      break;

    case DOMAIN_ID:
      if (value == null) {
        unsetDomainId();
      } else {
        setDomainId((String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case DESCRIPTION:
      if (value == null) {
        unsetDescription();
      } else {
        setDescription((String)value);
      }
      break;

    case CREATED_TIME:
      if (value == null) {
        unsetCreatedTime();
      } else {
        setCreatedTime((Long)value);
      }
      break;

    case UPDATED_TIME:
      if (value == null) {
        unsetUpdatedTime();
      } else {
        setUpdatedTime((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ENTITY_TYPE_ID:
      return getEntityTypeId();

    case DOMAIN_ID:
      return getDomainId();

    case NAME:
      return getName();

    case DESCRIPTION:
      return getDescription();

    case CREATED_TIME:
      return getCreatedTime();

    case UPDATED_TIME:
      return getUpdatedTime();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ENTITY_TYPE_ID:
      return isSetEntityTypeId();
    case DOMAIN_ID:
      return isSetDomainId();
    case NAME:
      return isSetName();
    case DESCRIPTION:
      return isSetDescription();
    case CREATED_TIME:
      return isSetCreatedTime();
    case UPDATED_TIME:
      return isSetUpdatedTime();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof EntityType)
      return this.equals((EntityType)that);
    return false;
  }

  public boolean equals(EntityType that) {
    if (that == null)
      return false;

    boolean this_present_entityTypeId = true && this.isSetEntityTypeId();
    boolean that_present_entityTypeId = true && that.isSetEntityTypeId();
    if (this_present_entityTypeId || that_present_entityTypeId) {
      if (!(this_present_entityTypeId && that_present_entityTypeId))
        return false;
      if (!this.entityTypeId.equals(that.entityTypeId))
        return false;
    }

    boolean this_present_domainId = true && this.isSetDomainId();
    boolean that_present_domainId = true && that.isSetDomainId();
    if (this_present_domainId || that_present_domainId) {
      if (!(this_present_domainId && that_present_domainId))
        return false;
      if (!this.domainId.equals(that.domainId))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_description = true && this.isSetDescription();
    boolean that_present_description = true && that.isSetDescription();
    if (this_present_description || that_present_description) {
      if (!(this_present_description && that_present_description))
        return false;
      if (!this.description.equals(that.description))
        return false;
    }

    boolean this_present_createdTime = true && this.isSetCreatedTime();
    boolean that_present_createdTime = true && that.isSetCreatedTime();
    if (this_present_createdTime || that_present_createdTime) {
      if (!(this_present_createdTime && that_present_createdTime))
        return false;
      if (this.createdTime != that.createdTime)
        return false;
    }

    boolean this_present_updatedTime = true && this.isSetUpdatedTime();
    boolean that_present_updatedTime = true && that.isSetUpdatedTime();
    if (this_present_updatedTime || that_present_updatedTime) {
      if (!(this_present_updatedTime && that_present_updatedTime))
        return false;
      if (this.updatedTime != that.updatedTime)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_entityTypeId = true && (isSetEntityTypeId());
    list.add(present_entityTypeId);
    if (present_entityTypeId)
      list.add(entityTypeId);

    boolean present_domainId = true && (isSetDomainId());
    list.add(present_domainId);
    if (present_domainId)
      list.add(domainId);

    boolean present_name = true && (isSetName());
    list.add(present_name);
    if (present_name)
      list.add(name);

    boolean present_description = true && (isSetDescription());
    list.add(present_description);
    if (present_description)
      list.add(description);

    boolean present_createdTime = true && (isSetCreatedTime());
    list.add(present_createdTime);
    if (present_createdTime)
      list.add(createdTime);

    boolean present_updatedTime = true && (isSetUpdatedTime());
    list.add(present_updatedTime);
    if (present_updatedTime)
      list.add(updatedTime);

    return list.hashCode();
  }

  @Override
  public int compareTo(EntityType other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetEntityTypeId()).compareTo(other.isSetEntityTypeId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEntityTypeId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.entityTypeId, other.entityTypeId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDomainId()).compareTo(other.isSetDomainId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDomainId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.domainId, other.domainId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDescription()).compareTo(other.isSetDescription());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDescription()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.description, other.description);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCreatedTime()).compareTo(other.isSetCreatedTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreatedTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.createdTime, other.createdTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUpdatedTime()).compareTo(other.isSetUpdatedTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdatedTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updatedTime, other.updatedTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("EntityType(");
    boolean first = true;

    if (isSetEntityTypeId()) {
      sb.append("entityTypeId:");
      if (this.entityTypeId == null) {
        sb.append("null");
      } else {
        sb.append(this.entityTypeId);
      }
      first = false;
    }
    if (isSetDomainId()) {
      if (!first) sb.append(", ");
      sb.append("domainId:");
      if (this.domainId == null) {
        sb.append("null");
      } else {
        sb.append(this.domainId);
      }
      first = false;
    }
    if (isSetName()) {
      if (!first) sb.append(", ");
      sb.append("name:");
      if (this.name == null) {
        sb.append("null");
      } else {
        sb.append(this.name);
      }
      first = false;
    }
    if (isSetDescription()) {
      if (!first) sb.append(", ");
      sb.append("description:");
      if (this.description == null) {
        sb.append("null");
      } else {
        sb.append(this.description);
      }
      first = false;
    }
    if (isSetCreatedTime()) {
      if (!first) sb.append(", ");
      sb.append("createdTime:");
      sb.append(this.createdTime);
      first = false;
    }
    if (isSetUpdatedTime()) {
      if (!first) sb.append(", ");
      sb.append("updatedTime:");
      sb.append(this.updatedTime);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class EntityTypeStandardSchemeFactory implements SchemeFactory {
    public EntityTypeStandardScheme getScheme() {
      return new EntityTypeStandardScheme();
    }
  }

  private static class EntityTypeStandardScheme extends StandardScheme<EntityType> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, EntityType struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ENTITY_TYPE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.entityTypeId = iprot.readString();
              struct.setEntityTypeIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DOMAIN_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.domainId = iprot.readString();
              struct.setDomainIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DESCRIPTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.description = iprot.readString();
              struct.setDescriptionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CREATED_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.createdTime = iprot.readI64();
              struct.setCreatedTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // UPDATED_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.updatedTime = iprot.readI64();
              struct.setUpdatedTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, EntityType struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.entityTypeId != null) {
        if (struct.isSetEntityTypeId()) {
          oprot.writeFieldBegin(ENTITY_TYPE_ID_FIELD_DESC);
          oprot.writeString(struct.entityTypeId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.domainId != null) {
        if (struct.isSetDomainId()) {
          oprot.writeFieldBegin(DOMAIN_ID_FIELD_DESC);
          oprot.writeString(struct.domainId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.name != null) {
        if (struct.isSetName()) {
          oprot.writeFieldBegin(NAME_FIELD_DESC);
          oprot.writeString(struct.name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.description != null) {
        if (struct.isSetDescription()) {
          oprot.writeFieldBegin(DESCRIPTION_FIELD_DESC);
          oprot.writeString(struct.description);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetCreatedTime()) {
        oprot.writeFieldBegin(CREATED_TIME_FIELD_DESC);
        oprot.writeI64(struct.createdTime);
        oprot.writeFieldEnd();
      }
      if (struct.isSetUpdatedTime()) {
        oprot.writeFieldBegin(UPDATED_TIME_FIELD_DESC);
        oprot.writeI64(struct.updatedTime);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EntityTypeTupleSchemeFactory implements SchemeFactory {
    public EntityTypeTupleScheme getScheme() {
      return new EntityTypeTupleScheme();
    }
  }

  private static class EntityTypeTupleScheme extends TupleScheme<EntityType> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, EntityType struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetEntityTypeId()) {
        optionals.set(0);
      }
      if (struct.isSetDomainId()) {
        optionals.set(1);
      }
      if (struct.isSetName()) {
        optionals.set(2);
      }
      if (struct.isSetDescription()) {
        optionals.set(3);
      }
      if (struct.isSetCreatedTime()) {
        optionals.set(4);
      }
      if (struct.isSetUpdatedTime()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetEntityTypeId()) {
        oprot.writeString(struct.entityTypeId);
      }
      if (struct.isSetDomainId()) {
        oprot.writeString(struct.domainId);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetDescription()) {
        oprot.writeString(struct.description);
      }
      if (struct.isSetCreatedTime()) {
        oprot.writeI64(struct.createdTime);
      }
      if (struct.isSetUpdatedTime()) {
        oprot.writeI64(struct.updatedTime);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, EntityType struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.entityTypeId = iprot.readString();
        struct.setEntityTypeIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.domainId = iprot.readString();
        struct.setDomainIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.description = iprot.readString();
        struct.setDescriptionIsSet(true);
      }
      if (incoming.get(4)) {
        struct.createdTime = iprot.readI64();
        struct.setCreatedTimeIsSet(true);
      }
      if (incoming.get(5)) {
        struct.updatedTime = iprot.readI64();
        struct.setUpdatedTimeIsSet(true);
      }
    }
  }

}

