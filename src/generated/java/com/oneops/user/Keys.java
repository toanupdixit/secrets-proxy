/*
 * This file is generated by jOOQ.
 */
package com.oneops.user;

import com.oneops.user.tables.*;
import com.oneops.user.tables.records.*;
import org.jooq.*;
import org.jooq.impl.AbstractKeys;

import javax.annotation.Generated;

/** A class modelling foreign key relationships between tables of the <code>public</code> schema */
@Generated(
  value = {"http://www.jooq.org", "jOOQ version:3.9.2"},
  comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Keys {

  // -------------------------------------------------------------------------
  // IDENTITY definitions
  // -------------------------------------------------------------------------

  public static final Identity<AuthenticationsRecord, Integer> IDENTITY_AUTHENTICATIONS =
      Identities0.IDENTITY_AUTHENTICATIONS;
  public static final Identity<CiProxiesRecord, Integer> IDENTITY_CI_PROXIES =
      Identities0.IDENTITY_CI_PROXIES;
  public static final Identity<CiProxiesTeamsRecord, Integer> IDENTITY_CI_PROXIES_TEAMS =
      Identities0.IDENTITY_CI_PROXIES_TEAMS;
  public static final Identity<GroupMembersRecord, Integer> IDENTITY_GROUP_MEMBERS =
      Identities0.IDENTITY_GROUP_MEMBERS;
  public static final Identity<GroupsRecord, Integer> IDENTITY_GROUPS = Identities0.IDENTITY_GROUPS;
  public static final Identity<GroupsTeamsRecord, Integer> IDENTITY_GROUPS_TEAMS =
      Identities0.IDENTITY_GROUPS_TEAMS;
  public static final Identity<InvitationsRecord, Integer> IDENTITY_INVITATIONS =
      Identities0.IDENTITY_INVITATIONS;
  public static final Identity<MiscDocsRecord, Integer> IDENTITY_MISC_DOCS =
      Identities0.IDENTITY_MISC_DOCS;
  public static final Identity<OrganizationsRecord, Integer> IDENTITY_ORGANIZATIONS =
      Identities0.IDENTITY_ORGANIZATIONS;
  public static final Identity<TeamsRecord, Integer> IDENTITY_TEAMS = Identities0.IDENTITY_TEAMS;
  public static final Identity<TeamsUsersRecord, Integer> IDENTITY_TEAMS_USERS =
      Identities0.IDENTITY_TEAMS_USERS;
  public static final Identity<UserFavoritesRecord, Integer> IDENTITY_USER_FAVORITES =
      Identities0.IDENTITY_USER_FAVORITES;
  public static final Identity<UserWatchesRecord, Integer> IDENTITY_USER_WATCHES =
      Identities0.IDENTITY_USER_WATCHES;
  public static final Identity<UsersRecord, Integer> IDENTITY_USERS = Identities0.IDENTITY_USERS;

  // -------------------------------------------------------------------------
  // UNIQUE and PRIMARY KEY definitions
  // -------------------------------------------------------------------------

  public static final UniqueKey<AuthenticationsRecord> AUTHENTICATIONS_PKEY =
      UniqueKeys0.AUTHENTICATIONS_PKEY;
  public static final UniqueKey<CiProxiesRecord> CI_PROXIES_PKEY = UniqueKeys0.CI_PROXIES_PKEY;
  public static final UniqueKey<CiProxiesTeamsRecord> CI_PROXIES_TEAMS_PKEY =
      UniqueKeys0.CI_PROXIES_TEAMS_PKEY;
  public static final UniqueKey<GroupMembersRecord> GROUP_MEMBERS_PKEY =
      UniqueKeys0.GROUP_MEMBERS_PKEY;
  public static final UniqueKey<GroupsRecord> GROUPS_PKEY = UniqueKeys0.GROUPS_PKEY;
  public static final UniqueKey<GroupsTeamsRecord> GROUPS_TEAMS_PKEY =
      UniqueKeys0.GROUPS_TEAMS_PKEY;
  public static final UniqueKey<InvitationsRecord> INVITATIONS_PKEY = UniqueKeys0.INVITATIONS_PKEY;
  public static final UniqueKey<MiscDocsRecord> MISC_DOCS_PKEY = UniqueKeys0.MISC_DOCS_PKEY;
  public static final UniqueKey<OrganizationsRecord> ORGANIZATIONS_PKEY =
      UniqueKeys0.ORGANIZATIONS_PKEY;
  public static final UniqueKey<TeamsRecord> TEAMS_PKEY = UniqueKeys0.TEAMS_PKEY;
  public static final UniqueKey<TeamsUsersRecord> TEAMS_USERS_PKEY = UniqueKeys0.TEAMS_USERS_PKEY;
  public static final UniqueKey<UserFavoritesRecord> USER_FAVORITES_PKEY =
      UniqueKeys0.USER_FAVORITES_PKEY;
  public static final UniqueKey<UserWatchesRecord> USER_WATCHES_PKEY =
      UniqueKeys0.USER_WATCHES_PKEY;
  public static final UniqueKey<UsersRecord> USERS_PKEY = UniqueKeys0.USERS_PKEY;

  // -------------------------------------------------------------------------
  // FOREIGN KEY definitions
  // -------------------------------------------------------------------------

  // -------------------------------------------------------------------------
  // [#1459] distribute members to avoid static initialisers > 64kb
  // -------------------------------------------------------------------------

  private static class Identities0 extends AbstractKeys {
    public static Identity<AuthenticationsRecord, Integer> IDENTITY_AUTHENTICATIONS =
        createIdentity(Authentications.AUTHENTICATIONS, Authentications.AUTHENTICATIONS.ID);
    public static Identity<CiProxiesRecord, Integer> IDENTITY_CI_PROXIES =
        createIdentity(CiProxies.CI_PROXIES, CiProxies.CI_PROXIES.ID);
    public static Identity<CiProxiesTeamsRecord, Integer> IDENTITY_CI_PROXIES_TEAMS =
        createIdentity(CiProxiesTeams.CI_PROXIES_TEAMS, CiProxiesTeams.CI_PROXIES_TEAMS.ID);
    public static Identity<GroupMembersRecord, Integer> IDENTITY_GROUP_MEMBERS =
        createIdentity(GroupMembers.GROUP_MEMBERS, GroupMembers.GROUP_MEMBERS.ID);
    public static Identity<GroupsRecord, Integer> IDENTITY_GROUPS =
        createIdentity(Groups.GROUPS, Groups.GROUPS.ID);
    public static Identity<GroupsTeamsRecord, Integer> IDENTITY_GROUPS_TEAMS =
        createIdentity(GroupsTeams.GROUPS_TEAMS, GroupsTeams.GROUPS_TEAMS.ID);
    public static Identity<InvitationsRecord, Integer> IDENTITY_INVITATIONS =
        createIdentity(Invitations.INVITATIONS, Invitations.INVITATIONS.ID);
    public static Identity<MiscDocsRecord, Integer> IDENTITY_MISC_DOCS =
        createIdentity(MiscDocs.MISC_DOCS, MiscDocs.MISC_DOCS.ID);
    public static Identity<OrganizationsRecord, Integer> IDENTITY_ORGANIZATIONS =
        createIdentity(Organizations.ORGANIZATIONS, Organizations.ORGANIZATIONS.ID);
    public static Identity<TeamsRecord, Integer> IDENTITY_TEAMS =
        createIdentity(Teams.TEAMS, Teams.TEAMS.ID);
    public static Identity<TeamsUsersRecord, Integer> IDENTITY_TEAMS_USERS =
        createIdentity(TeamsUsers.TEAMS_USERS, TeamsUsers.TEAMS_USERS.ID);
    public static Identity<UserFavoritesRecord, Integer> IDENTITY_USER_FAVORITES =
        createIdentity(UserFavorites.USER_FAVORITES, UserFavorites.USER_FAVORITES.ID);
    public static Identity<UserWatchesRecord, Integer> IDENTITY_USER_WATCHES =
        createIdentity(UserWatches.USER_WATCHES, UserWatches.USER_WATCHES.ID);
    public static Identity<UsersRecord, Integer> IDENTITY_USERS =
        createIdentity(Users.USERS, Users.USERS.ID);
  }

  private static class UniqueKeys0 extends AbstractKeys {
    public static final UniqueKey<AuthenticationsRecord> AUTHENTICATIONS_PKEY =
        createUniqueKey(
            Authentications.AUTHENTICATIONS,
            "authentications_pkey",
            Authentications.AUTHENTICATIONS.ID);
    public static final UniqueKey<CiProxiesRecord> CI_PROXIES_PKEY =
        createUniqueKey(CiProxies.CI_PROXIES, "ci_proxies_pkey", CiProxies.CI_PROXIES.ID);
    public static final UniqueKey<CiProxiesTeamsRecord> CI_PROXIES_TEAMS_PKEY =
        createUniqueKey(
            CiProxiesTeams.CI_PROXIES_TEAMS,
            "ci_proxies_teams_pkey",
            CiProxiesTeams.CI_PROXIES_TEAMS.ID);
    public static final UniqueKey<GroupMembersRecord> GROUP_MEMBERS_PKEY =
        createUniqueKey(
            GroupMembers.GROUP_MEMBERS, "group_members_pkey", GroupMembers.GROUP_MEMBERS.ID);
    public static final UniqueKey<GroupsRecord> GROUPS_PKEY =
        createUniqueKey(Groups.GROUPS, "groups_pkey", Groups.GROUPS.ID);
    public static final UniqueKey<GroupsTeamsRecord> GROUPS_TEAMS_PKEY =
        createUniqueKey(GroupsTeams.GROUPS_TEAMS, "groups_teams_pkey", GroupsTeams.GROUPS_TEAMS.ID);
    public static final UniqueKey<InvitationsRecord> INVITATIONS_PKEY =
        createUniqueKey(Invitations.INVITATIONS, "invitations_pkey", Invitations.INVITATIONS.ID);
    public static final UniqueKey<MiscDocsRecord> MISC_DOCS_PKEY =
        createUniqueKey(MiscDocs.MISC_DOCS, "misc_docs_pkey", MiscDocs.MISC_DOCS.ID);
    public static final UniqueKey<OrganizationsRecord> ORGANIZATIONS_PKEY =
        createUniqueKey(
            Organizations.ORGANIZATIONS, "organizations_pkey", Organizations.ORGANIZATIONS.ID);
    public static final UniqueKey<TeamsRecord> TEAMS_PKEY =
        createUniqueKey(Teams.TEAMS, "teams_pkey", Teams.TEAMS.ID);
    public static final UniqueKey<TeamsUsersRecord> TEAMS_USERS_PKEY =
        createUniqueKey(TeamsUsers.TEAMS_USERS, "teams_users_pkey", TeamsUsers.TEAMS_USERS.ID);
    public static final UniqueKey<UserFavoritesRecord> USER_FAVORITES_PKEY =
        createUniqueKey(
            UserFavorites.USER_FAVORITES, "user_favorites_pkey", UserFavorites.USER_FAVORITES.ID);
    public static final UniqueKey<UserWatchesRecord> USER_WATCHES_PKEY =
        createUniqueKey(UserWatches.USER_WATCHES, "user_watches_pkey", UserWatches.USER_WATCHES.ID);
    public static final UniqueKey<UsersRecord> USERS_PKEY =
        createUniqueKey(Users.USERS, "users_pkey", Users.USERS.ID);
  }
}
