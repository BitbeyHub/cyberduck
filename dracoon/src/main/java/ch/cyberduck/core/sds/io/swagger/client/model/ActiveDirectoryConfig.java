/*
 * DRACOON
 * REST Web Services for DRACOON<br>Version: 4.10.7-LTS  - built at: 2019-03-19 14:24:35<br><br><a title='Developer Information' href='https://developer.dracoon.com'>Developer Information</a>&emsp;&emsp;<a title='Get SDKs on GitHub' href='https://github.com/dracoon'>Get SDKs on GitHub</a>
 *
 * OpenAPI spec version: 4.10.7-LTS
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.sds.io.swagger.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * ActiveDirectoryConfig
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-13T14:25:40.305+02:00")
public class ActiveDirectoryConfig {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("alias")
  private String alias = null;

  @JsonProperty("serverIp")
  private String serverIp = null;

  @JsonProperty("serverPort")
  private Integer serverPort = null;

  @JsonProperty("serverAdminName")
  private String serverAdminName = null;

  @JsonProperty("ldapUsersDomain")
  private String ldapUsersDomain = null;

  @JsonProperty("userFilter")
  private String userFilter = null;

  @JsonProperty("userImport")
  private Boolean userImport = null;

  @JsonProperty("adExportGroup")
  private String adExportGroup = null;

  @JsonProperty("createHomeFolder")
  private Boolean createHomeFolder = null;

  @JsonProperty("useLdaps")
  private Boolean useLdaps = null;

  @JsonProperty("sdsImportGroup")
  private Long sdsImportGroup = null;

  @JsonProperty("homeFolderParent")
  private Long homeFolderParent = null;

  @JsonProperty("sslFingerPrint")
  private String sslFingerPrint = null;

  public ActiveDirectoryConfig id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * ID
   * @return id
  **/
  @ApiModelProperty(required = true, value = "ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ActiveDirectoryConfig alias(String alias) {
    this.alias = alias;
    return this;
  }

   /**
   * Unique name for an Active Directory configuration
   * @return alias
  **/
  @ApiModelProperty(required = true, value = "Unique name for an Active Directory configuration")
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public ActiveDirectoryConfig serverIp(String serverIp) {
    this.serverIp = serverIp;
    return this;
  }

   /**
   * IPv4 or IPv6 address or host name
   * @return serverIp
  **/
  @ApiModelProperty(required = true, value = "IPv4 or IPv6 address or host name")
  public String getServerIp() {
    return serverIp;
  }

  public void setServerIp(String serverIp) {
    this.serverIp = serverIp;
  }

  public ActiveDirectoryConfig serverPort(Integer serverPort) {
    this.serverPort = serverPort;
    return this;
  }

   /**
   * Port
   * @return serverPort
  **/
  @ApiModelProperty(required = true, value = "Port")
  public Integer getServerPort() {
    return serverPort;
  }

  public void setServerPort(Integer serverPort) {
    this.serverPort = serverPort;
  }

  public ActiveDirectoryConfig serverAdminName(String serverAdminName) {
    this.serverAdminName = serverAdminName;
    return this;
  }

   /**
   * Distinguished Name (DN) of Active Directory administrative account
   * @return serverAdminName
  **/
  @ApiModelProperty(required = true, value = "Distinguished Name (DN) of Active Directory administrative account")
  public String getServerAdminName() {
    return serverAdminName;
  }

  public void setServerAdminName(String serverAdminName) {
    this.serverAdminName = serverAdminName;
  }

  public ActiveDirectoryConfig ldapUsersDomain(String ldapUsersDomain) {
    this.ldapUsersDomain = ldapUsersDomain;
    return this;
  }

   /**
   * Search scope of Active Directory; only users below this node can log on.
   * @return ldapUsersDomain
  **/
  @ApiModelProperty(required = true, value = "Search scope of Active Directory; only users below this node can log on.")
  public String getLdapUsersDomain() {
    return ldapUsersDomain;
  }

  public void setLdapUsersDomain(String ldapUsersDomain) {
    this.ldapUsersDomain = ldapUsersDomain;
  }

  public ActiveDirectoryConfig userFilter(String userFilter) {
    this.userFilter = userFilter;
    return this;
  }

   /**
   * Name of Active Directory attribute that is used as login name.
   * @return userFilter
  **/
  @ApiModelProperty(required = true, value = "Name of Active Directory attribute that is used as login name.")
  public String getUserFilter() {
    return userFilter;
  }

  public void setUserFilter(String userFilter) {
    this.userFilter = userFilter;
  }

  public ActiveDirectoryConfig userImport(Boolean userImport) {
    this.userImport = userImport;
    return this;
  }

   /**
    * Determines if a DRACOON account is automatically created for a new user who successfully logs on with his / her AD / IDP account.
   * @return userImport
  **/
   @ApiModelProperty(example = "false", required = true, value = "Determines if a DRACOON account is automatically created for a new user who successfully logs on with his / her AD / IDP account.")
   public Boolean isUserImport() {
    return userImport;
  }

  public void setUserImport(Boolean userImport) {
    this.userImport = userImport;
  }

  public ActiveDirectoryConfig adExportGroup(String adExportGroup) {
    this.adExportGroup = adExportGroup;
    return this;
  }

   /**
    * If &#x60;userImport&#x60; is set to &#x60;true&#x60;, the user must be member of this Active Directory group to receive a newly created DRACOON account.
   * @return adExportGroup
  **/
   @ApiModelProperty(required = true, value = "If `userImport` is set to `true`, the user must be member of this Active Directory group to receive a newly created DRACOON account.")
  public String getAdExportGroup() {
    return adExportGroup;
  }

  public void setAdExportGroup(String adExportGroup) {
    this.adExportGroup = adExportGroup;
  }

  public ActiveDirectoryConfig createHomeFolder(Boolean createHomeFolder) {
    this.createHomeFolder = createHomeFolder;
    return this;
  }

   /**
    * DEPRECATED, will be ignored Determines whether a room is created for each user that is created by automatic import (like a home folder). Room&#39;s name will equal the user&#39;s login name. (default: &#x60;false&#x60;)  [Deprecated since version 4.10.2]
   * @return createHomeFolder
  **/
   @ApiModelProperty(example = "false", value = "DEPRECATED, will be ignored Determines whether a room is created for each user that is created by automatic import (like a home folder). Room's name will equal the user's login name. (default: `false`)  [Deprecated since version 4.10.2]")
   public Boolean isCreateHomeFolder() {
    return createHomeFolder;
  }

  public void setCreateHomeFolder(Boolean createHomeFolder) {
    this.createHomeFolder = createHomeFolder;
  }

  public ActiveDirectoryConfig useLdaps(Boolean useLdaps) {
    this.useLdaps = useLdaps;
    return this;
  }

   /**
   * Determines whether LDAPS should be used instead of plain LDAP.
   * @return useLdaps
  **/
   @ApiModelProperty(example = "false", required = true, value = "Determines whether LDAPS should be used instead of plain LDAP.")
   public Boolean isUseLdaps() {
    return useLdaps;
  }

  public void setUseLdaps(Boolean useLdaps) {
    this.useLdaps = useLdaps;
  }

  public ActiveDirectoryConfig sdsImportGroup(Long sdsImportGroup) {
    this.sdsImportGroup = sdsImportGroup;
    return this;
  }

   /**
   * User group that is assigned to users who are created by automatic import.
   * @return sdsImportGroup
  **/
  @ApiModelProperty(value = "User group that is assigned to users who are created by automatic import.")
  public Long getSdsImportGroup() {
    return sdsImportGroup;
  }

  public void setSdsImportGroup(Long sdsImportGroup) {
    this.sdsImportGroup = sdsImportGroup;
  }

  public ActiveDirectoryConfig homeFolderParent(Long homeFolderParent) {
    this.homeFolderParent = homeFolderParent;
    return this;
  }

   /**
    * DEPRECATED, will be ignored ID of the room in which the individual rooms for users will be created.  [Deprecated since version 4.10.2]
   * @return homeFolderParent
  **/
   @ApiModelProperty(value = "DEPRECATED, will be ignored ID of the room in which the individual rooms for users will be created.  [Deprecated since version 4.10.2]")
  public Long getHomeFolderParent() {
    return homeFolderParent;
  }

  public void setHomeFolderParent(Long homeFolderParent) {
    this.homeFolderParent = homeFolderParent;
  }

  public ActiveDirectoryConfig sslFingerPrint(String sslFingerPrint) {
    this.sslFingerPrint = sslFingerPrint;
    return this;
  }

   /**
   * SSL finger print of Active Directory server. Mandatory for LDAPS connections. Format: &#x60;Algorithm/Fingerprint&#x60;
   * @return sslFingerPrint
  **/
  @ApiModelProperty(value = "SSL finger print of Active Directory server. Mandatory for LDAPS connections. Format: `Algorithm/Fingerprint`")
  public String getSslFingerPrint() {
    return sslFingerPrint;
  }

  public void setSslFingerPrint(String sslFingerPrint) {
    this.sslFingerPrint = sslFingerPrint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActiveDirectoryConfig activeDirectoryConfig = (ActiveDirectoryConfig) o;
    return Objects.equals(this.id, activeDirectoryConfig.id) &&
        Objects.equals(this.alias, activeDirectoryConfig.alias) &&
        Objects.equals(this.serverIp, activeDirectoryConfig.serverIp) &&
        Objects.equals(this.serverPort, activeDirectoryConfig.serverPort) &&
        Objects.equals(this.serverAdminName, activeDirectoryConfig.serverAdminName) &&
        Objects.equals(this.ldapUsersDomain, activeDirectoryConfig.ldapUsersDomain) &&
        Objects.equals(this.userFilter, activeDirectoryConfig.userFilter) &&
        Objects.equals(this.userImport, activeDirectoryConfig.userImport) &&
        Objects.equals(this.adExportGroup, activeDirectoryConfig.adExportGroup) &&
        Objects.equals(this.createHomeFolder, activeDirectoryConfig.createHomeFolder) &&
        Objects.equals(this.useLdaps, activeDirectoryConfig.useLdaps) &&
        Objects.equals(this.sdsImportGroup, activeDirectoryConfig.sdsImportGroup) &&
        Objects.equals(this.homeFolderParent, activeDirectoryConfig.homeFolderParent) &&
        Objects.equals(this.sslFingerPrint, activeDirectoryConfig.sslFingerPrint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, alias, serverIp, serverPort, serverAdminName, ldapUsersDomain, userFilter, userImport, adExportGroup, createHomeFolder, useLdaps, sdsImportGroup, homeFolderParent, sslFingerPrint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActiveDirectoryConfig {\n");

      sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
    sb.append("    serverPort: ").append(toIndentedString(serverPort)).append("\n");
    sb.append("    serverAdminName: ").append(toIndentedString(serverAdminName)).append("\n");
    sb.append("    ldapUsersDomain: ").append(toIndentedString(ldapUsersDomain)).append("\n");
    sb.append("    userFilter: ").append(toIndentedString(userFilter)).append("\n");
    sb.append("    userImport: ").append(toIndentedString(userImport)).append("\n");
    sb.append("    adExportGroup: ").append(toIndentedString(adExportGroup)).append("\n");
    sb.append("    createHomeFolder: ").append(toIndentedString(createHomeFolder)).append("\n");
    sb.append("    useLdaps: ").append(toIndentedString(useLdaps)).append("\n");
    sb.append("    sdsImportGroup: ").append(toIndentedString(sdsImportGroup)).append("\n");
    sb.append("    homeFolderParent: ").append(toIndentedString(homeFolderParent)).append("\n");
    sb.append("    sslFingerPrint: ").append(toIndentedString(sslFingerPrint)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

