/*
 * This file is generated by jOOQ.
 */
package com.oneops.user;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;

import javax.annotation.Generated;

/** Convenience access to all sequences in public */
@Generated(
  value = {"http://www.jooq.org", "jOOQ version:3.9.2"},
  comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Sequences {

  /** The sequence <code>public.authentications_id_seq</code> */
  public static final Sequence<Long> AUTHENTICATIONS_ID_SEQ =
      new SequenceImpl<Long>(
          "authentications_id_seq",
          Public.PUBLIC,
          org.jooq.impl.SQLDataType.BIGINT.nullable(false));

  /** The sequence <code>public.ci_proxies_id_seq</code> */
  public static final Sequence<Long> CI_PROXIES_ID_SEQ =
      new SequenceImpl<Long>(
          "ci_proxies_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

  /** The sequence <code>public.ci_proxies_teams_id_seq</code> */
  public static final Sequence<Long> CI_PROXIES_TEAMS_ID_SEQ =
      new SequenceImpl<Long>(
          "ci_proxies_teams_id_seq",
          Public.PUBLIC,
          org.jooq.impl.SQLDataType.BIGINT.nullable(false));

  /** The sequence <code>public.group_members_id_seq</code> */
  public static final Sequence<Long> GROUP_MEMBERS_ID_SEQ =
      new SequenceImpl<Long>(
          "group_members_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

  /** The sequence <code>public.groups_id_seq</code> */
  public static final Sequence<Long> GROUPS_ID_SEQ =
      new SequenceImpl<Long>(
          "groups_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

  /** The sequence <code>public.groups_teams_id_seq</code> */
  public static final Sequence<Long> GROUPS_TEAMS_ID_SEQ =
      new SequenceImpl<Long>(
          "groups_teams_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

  /** The sequence <code>public.invitations_id_seq</code> */
  public static final Sequence<Long> INVITATIONS_ID_SEQ =
      new SequenceImpl<Long>(
          "invitations_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

  /** The sequence <code>public.misc_docs_id_seq</code> */
  public static final Sequence<Long> MISC_DOCS_ID_SEQ =
      new SequenceImpl<Long>(
          "misc_docs_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

  /** The sequence <code>public.organizations_id_seq</code> */
  public static final Sequence<Long> ORGANIZATIONS_ID_SEQ =
      new SequenceImpl<Long>(
          "organizations_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

  /** The sequence <code>public.teams_id_seq</code> */
  public static final Sequence<Long> TEAMS_ID_SEQ =
      new SequenceImpl<Long>(
          "teams_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

  /** The sequence <code>public.teams_users_id_seq</code> */
  public static final Sequence<Long> TEAMS_USERS_ID_SEQ =
      new SequenceImpl<Long>(
          "teams_users_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

  /** The sequence <code>public.user_favorites_id_seq</code> */
  public static final Sequence<Long> USER_FAVORITES_ID_SEQ =
      new SequenceImpl<Long>(
          "user_favorites_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

  /** The sequence <code>public.users_id_seq</code> */
  public static final Sequence<Long> USERS_ID_SEQ =
      new SequenceImpl<Long>(
          "users_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

  /** The sequence <code>public.user_watches_id_seq</code> */
  public static final Sequence<Long> USER_WATCHES_ID_SEQ =
      new SequenceImpl<Long>(
          "user_watches_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));
}
