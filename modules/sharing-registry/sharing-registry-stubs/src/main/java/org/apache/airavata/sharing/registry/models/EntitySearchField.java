/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.sharing.registry.models;


public enum EntitySearchField implements org.apache.thrift.TEnum {
  NAME(0),
  DESCRIPTION(1),
  FULL_TEXT(2),
  PRRENT_ENTITY_ID(3),
  CREATED_TIME(4),
  UPDATED_TIME(5);

  private final int value;

  private EntitySearchField(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static EntitySearchField findByValue(int value) { 
    switch (value) {
      case 0:
        return NAME;
      case 1:
        return DESCRIPTION;
      case 2:
        return FULL_TEXT;
      case 3:
        return PRRENT_ENTITY_ID;
      case 4:
        return CREATED_TIME;
      case 5:
        return UPDATED_TIME;
      default:
        return null;
    }
  }
}
