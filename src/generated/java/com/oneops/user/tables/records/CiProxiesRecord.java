/*
 * This file is generated by jOOQ.
 */
package com.oneops.user.tables.records;

import com.oneops.user.tables.CiProxies;
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
public class CiProxiesRecord extends UpdatableRecordImpl<CiProxiesRecord>
    implements Record8<Integer, Integer, Integer, String, String, Timestamp, Timestamp, String> {

  private static final long serialVersionUID = -1591616185;

  /** Setter for <code>public.ci_proxies.id</code>. */
  public void setId(Integer value) {
    set(0, value);
  }

  /** Getter for <code>public.ci_proxies.id</code>. */
  public Integer getId() {
    return (Integer) get(0);
  }

  /** Setter for <code>public.ci_proxies.organization_id</code>. */
  public void setOrganizationId(Integer value) {
    set(1, value);
  }

  /** Getter for <code>public.ci_proxies.organization_id</code>. */
  public Integer getOrganizationId() {
    return (Integer) get(1);
  }

  /** Setter for <code>public.ci_proxies.ci_id</code>. */
  public void setCiId(Integer value) {
    set(2, value);
  }

  /** Getter for <code>public.ci_proxies.ci_id</code>. */
  public Integer getCiId() {
    return (Integer) get(2);
  }

  /** Setter for <code>public.ci_proxies.ci_name</code>. */
  public void setCiName(String value) {
    set(3, value);
  }

  /** Getter for <code>public.ci_proxies.ci_name</code>. */
  public String getCiName() {
    return (String) get(3);
  }

  /** Setter for <code>public.ci_proxies.ns_path</code>. */
  public void setNsPath(String value) {
    set(4, value);
  }

  /** Getter for <code>public.ci_proxies.ns_path</code>. */
  public String getNsPath() {
    return (String) get(4);
  }

  /** Setter for <code>public.ci_proxies.created_at</code>. */
  public void setCreatedAt(Timestamp value) {
    set(5, value);
  }

  /** Getter for <code>public.ci_proxies.created_at</code>. */
  public Timestamp getCreatedAt() {
    return (Timestamp) get(5);
  }

  /** Setter for <code>public.ci_proxies.updated_at</code>. */
  public void setUpdatedAt(Timestamp value) {
    set(6, value);
  }

  /** Getter for <code>public.ci_proxies.updated_at</code>. */
  public Timestamp getUpdatedAt() {
    return (Timestamp) get(6);
  }

  /** Setter for <code>public.ci_proxies.ci_class_name</code>. */
  public void setCiClassName(String value) {
    set(7, value);
  }

  /** Getter for <code>public.ci_proxies.ci_class_name</code>. */
  public String getCiClassName() {
    return (String) get(7);
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
  // Record8 type implementation
  // -------------------------------------------------------------------------

  /** {@inheritDoc} */
  @Override
  public Row8<Integer, Integer, Integer, String, String, Timestamp, Timestamp, String> fieldsRow() {
    return (Row8) super.fieldsRow();
  }

  /** {@inheritDoc} */
  @Override
  public Row8<Integer, Integer, Integer, String, String, Timestamp, Timestamp, String> valuesRow() {
    return (Row8) super.valuesRow();
  }

  /** {@inheritDoc} */
  @Override
  public Field<Integer> field1() {
    return CiProxies.CI_PROXIES.ID;
  }

  /** {@inheritDoc} */
  @Override
  public Field<Integer> field2() {
    return CiProxies.CI_PROXIES.ORGANIZATION_ID;
  }

  /** {@inheritDoc} */
  @Override
  public Field<Integer> field3() {
    return CiProxies.CI_PROXIES.CI_ID;
  }

  /** {@inheritDoc} */
  @Override
  public Field<String> field4() {
    return CiProxies.CI_PROXIES.CI_NAME;
  }

  /** {@inheritDoc} */
  @Override
  public Field<String> field5() {
    return CiProxies.CI_PROXIES.NS_PATH;
  }

  /** {@inheritDoc} */
  @Override
  public Field<Timestamp> field6() {
    return CiProxies.CI_PROXIES.CREATED_AT;
  }

  /** {@inheritDoc} */
  @Override
  public Field<Timestamp> field7() {
    return CiProxies.CI_PROXIES.UPDATED_AT;
  }

  /** {@inheritDoc} */
  @Override
  public Field<String> field8() {
    return CiProxies.CI_PROXIES.CI_CLASS_NAME;
  }

  /** {@inheritDoc} */
  @Override
  public Integer value1() {
    return getId();
  }

  /** {@inheritDoc} */
  @Override
  public Integer value2() {
    return getOrganizationId();
  }

  /** {@inheritDoc} */
  @Override
  public Integer value3() {
    return getCiId();
  }

  /** {@inheritDoc} */
  @Override
  public String value4() {
    return getCiName();
  }

  /** {@inheritDoc} */
  @Override
  public String value5() {
    return getNsPath();
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
  public String value8() {
    return getCiClassName();
  }

  /** {@inheritDoc} */
  @Override
  public CiProxiesRecord value1(Integer value) {
    setId(value);
    return this;
  }

  /** {@inheritDoc} */
  @Override
  public CiProxiesRecord value2(Integer value) {
    setOrganizationId(value);
    return this;
  }

  /** {@inheritDoc} */
  @Override
  public CiProxiesRecord value3(Integer value) {
    setCiId(value);
    return this;
  }

  /** {@inheritDoc} */
  @Override
  public CiProxiesRecord value4(String value) {
    setCiName(value);
    return this;
  }

  /** {@inheritDoc} */
  @Override
  public CiProxiesRecord value5(String value) {
    setNsPath(value);
    return this;
  }

  /** {@inheritDoc} */
  @Override
  public CiProxiesRecord value6(Timestamp value) {
    setCreatedAt(value);
    return this;
  }

  /** {@inheritDoc} */
  @Override
  public CiProxiesRecord value7(Timestamp value) {
    setUpdatedAt(value);
    return this;
  }

  /** {@inheritDoc} */
  @Override
  public CiProxiesRecord value8(String value) {
    setCiClassName(value);
    return this;
  }

  /** {@inheritDoc} */
  @Override
  public CiProxiesRecord values(
      Integer value1,
      Integer value2,
      Integer value3,
      String value4,
      String value5,
      Timestamp value6,
      Timestamp value7,
      String value8) {
    value1(value1);
    value2(value2);
    value3(value3);
    value4(value4);
    value5(value5);
    value6(value6);
    value7(value7);
    value8(value8);
    return this;
  }

  // -------------------------------------------------------------------------
  // Constructors
  // -------------------------------------------------------------------------

  /** Create a detached CiProxiesRecord */
  public CiProxiesRecord() {
    super(CiProxies.CI_PROXIES);
  }

  /** Create a detached, initialised CiProxiesRecord */
  public CiProxiesRecord(
      Integer id,
      Integer organizationId,
      Integer ciId,
      String ciName,
      String nsPath,
      Timestamp createdAt,
      Timestamp updatedAt,
      String ciClassName) {
    super(CiProxies.CI_PROXIES);

    set(0, id);
    set(1, organizationId);
    set(2, ciId);
    set(3, ciName);
    set(4, nsPath);
    set(5, createdAt);
    set(6, updatedAt);
    set(7, ciClassName);
  }
}
