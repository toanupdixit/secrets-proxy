/*
 * This file is generated by jOOQ.
 */
package com.oneops.user.tables.records;

import com.oneops.user.tables.GroupMembers;
import org.jooq.*;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;

/** This class is generated by jOOQ. */
@Generated(
  value = {"http://www.jooq.org", "jOOQ version:3.9.2"},
  comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class GroupMembersRecord extends UpdatableRecordImpl<GroupMembersRecord>
    implements Record7<Integer, Integer, Integer, Boolean, String, Timestamp, Timestamp> {

  private static final long serialVersionUID = -851352091;

  /** Setter for <code>public.group_members.id</code>. */
  public void setId(Integer value) {
    set(0, value);
  }

  /** Getter for <code>public.group_members.id</code>. */
  public Integer getId() {
    return (Integer) get(0);
  }

  /** Setter for <code>public.group_members.group_id</code>. */
  public void setGroupId(Integer value) {
    set(1, value);
  }

  /** Getter for <code>public.group_members.group_id</code>. */
  public Integer getGroupId() {
    return (Integer) get(1);
  }

  /** Setter for <code>public.group_members.user_id</code>. */
  public void setUserId(Integer value) {
    set(2, value);
  }

  /** Getter for <code>public.group_members.user_id</code>. */
  public Integer getUserId() {
    return (Integer) get(2);
  }

  /** Setter for <code>public.group_members.admin</code>. */
  public void setAdmin(Boolean value) {
    set(3, value);
  }

  /** Getter for <code>public.group_members.admin</code>. */
  public Boolean getAdmin() {
    return (Boolean) get(3);
  }

  /** Setter for <code>public.group_members.created_by</code>. */
  public void setCreatedBy(String value) {
    set(4, value);
  }

  /** Getter for <code>public.group_members.created_by</code>. */
  public String getCreatedBy() {
    return (String) get(4);
  }

  /** Setter for <code>public.group_members.created_at</code>. */
  public void setCreatedAt(Timestamp value) {
    set(5, value);
  }

  /** Getter for <code>public.group_members.created_at</code>. */
  public Timestamp getCreatedAt() {
    return (Timestamp) get(5);
  }

  /** Setter for <code>public.group_members.updated_at</code>. */
  public void setUpdatedAt(Timestamp value) {
    set(6, value);
  }

  /** Getter for <code>public.group_members.updated_at</code>. */
  public Timestamp getUpdatedAt() {
    return (Timestamp) get(6);
  }

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------

  /** {@inheritDoc} */
  @Override
  public Record1<Integer> key() {
    return (Record1) super.key();
  }

  // -------------------------------------------------------------------------
  // Record7 type implementation
  // -------------------------------------------------------------------------

  /** {@inheritDoc} */
  @Override
  public Row7<Integer, Integer, Integer, Boolean, String, Timestamp, Timestamp> fieldsRow() {
    return (Row7) super.fieldsRow();
  }

  /** {@inheritDoc} */
  @Override
  public Row7<Integer, Integer, Integer, Boolean, String, Timestamp, Timestamp> valuesRow() {
    return (Row7) super.valuesRow();
  }

  /** {@inheritDoc} */
  @Override
  public Field<Integer> field1() {
    return GroupMembers.GROUP_MEMBERS.ID;
  }

  /** {@inheritDoc} */
  @Override
  public Field<Integer> field2() {
    return GroupMembers.GROUP_MEMBERS.GROUP_ID;
  }

  /** {@inheritDoc} */
  @Override
  public Field<Integer> field3() {
    return GroupMembers.GROUP_MEMBERS.USER_ID;
  }

  /** {@inheritDoc} */
  @Override
  public Field<Boolean> field4() {
    return GroupMembers.GROUP_MEMBERS.ADMIN;
  }

  /** {@inheritDoc} */
  @Override
  public Field<String> field5() {
    return GroupMembers.GROUP_MEMBERS.CREATED_BY;
  }

  /** {@inheritDoc} */
  @Override
  public Field<Timestamp> field6() {
    return GroupMembers.GROUP_MEMBERS.CREATED_AT;
  }

  /** {@inheritDoc} */
  @Override
  public Field<Timestamp> field7() {
    return GroupMembers.GROUP_MEMBERS.UPDATED_AT;
  }

  /** {@inheritDoc} */
  @Override
  public Integer value1() {
    return getId();
  }

  /** {@inheritDoc} */
  @Override
  public Integer value2() {
    return getGroupId();
  }

  /** {@inheritDoc} */
  @Override
  public Integer value3() {
    return getUserId();
  }

  /** {@inheritDoc} */
  @Override
  public Boolean value4() {
    return getAdmin();
  }

  /** {@inheritDoc} */
  @Override
  public String value5() {
    return getCreatedBy();
  }

  /** {@inheritDoc} */
  @Override
  public Timestamp value6() {
    return getCreatedAt();
  }

  /** {@inheritDoc} */
  @Override
  public Timestamp value7() {
    return getUpdatedAt();
  }

  /** {@inheritDoc} */
  @Override
  public GroupMembersRecord value1(Integer value) {
    setId(value);
    return this;
  }

  /** {@inheritDoc} */
  @Override
  public GroupMembersRecord value2(Integer value) {
    setGroupId(value);
    return this;
  }

  /** {@inheritDoc} */
  @Override
  public GroupMembersRecord value3(Integer value) {
    setUserId(value);
    return this;
  }

  /** {@inheritDoc} */
  @Override
  public GroupMembersRecord value4(Boolean value) {
    setAdmin(value);
    return this;
  }

  /** {@inheritDoc} */
  @Override
  public GroupMembersRecord value5(String value) {
    setCreatedBy(value);
    return this;
  }

  /** {@inheritDoc} */
  @Override
  public GroupMembersRecord value6(Timestamp value) {
    setCreatedAt(value);
    return this;
  }

  /** {@inheritDoc} */
  @Override
  public GroupMembersRecord value7(Timestamp value) {
    setUpdatedAt(value);
    return this;
  }

  /** {@inheritDoc} */
  @Override
  public GroupMembersRecord values(
      Integer value1,
      Integer value2,
      Integer value3,
      Boolean value4,
      String value5,
      Timestamp value6,
      Timestamp value7) {
    value1(value1);
    value2(value2);
    value3(value3);
    value4(value4);
    value5(value5);
    value6(value6);
    value7(value7);
    return this;
  }

  // -------------------------------------------------------------------------
  // Constructors
  // -------------------------------------------------------------------------

  /** Create a detached GroupMembersRecord */
  public GroupMembersRecord() {
    super(GroupMembers.GROUP_MEMBERS);
  }

  /** Create a detached, initialised GroupMembersRecord */
  public GroupMembersRecord(
      Integer id,
      Integer groupId,
      Integer userId,
      Boolean admin,
      String createdBy,
      Timestamp createdAt,
      Timestamp updatedAt) {
    super(GroupMembers.GROUP_MEMBERS);

    set(0, id);
    set(1, groupId);
    set(2, userId);
    set(3, admin);
    set(4, createdBy);
    set(5, createdAt);
    set(6, updatedAt);
  }
}
