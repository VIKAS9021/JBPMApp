package com.citiustech.mrr;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class Chase implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("MemberName")
	private java.lang.String member;

	@org.kie.api.definition.type.Label("MeasureName")
	private java.lang.String measure;

	@org.kie.api.definition.type.Label("Status")
	private java.lang.String status;

	@org.kie.api.definition.type.Label("User")
	private java.lang.String user;

	@org.kie.api.definition.type.Label("PreviousUser")
	private java.lang.String previousUser;

	@org.kie.api.definition.type.Label("OverReadRequired")
	private java.lang.Integer overreadRequired;

	@org.kie.api.definition.type.Label("Query")
	private String query;

	@org.kie.api.definition.type.Label("MOC")
	private java.lang.String moc;

	public Chase() {
	}

	public java.lang.String getMember() {
		return this.member;
	}

	public void setMember(java.lang.String member) {
		this.member = member;
	}

	public java.lang.String getMeasure() {
		return this.measure;
	}

	public void setMeasure(java.lang.String measure) {
		this.measure = measure;
	}

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public java.lang.String getUser() {
		return this.user;
	}

	public void setUser(java.lang.String user) {
		this.user = user;
	}

	public java.lang.String getPreviousUser() {
		return this.previousUser;
	}

	public void setPreviousUser(java.lang.String previousUser) {
		this.previousUser = previousUser;
	}

	public java.lang.Integer getOverreadRequired() {
		return this.overreadRequired;
	}

	public void setOverreadRequired(java.lang.Integer overreadRequired) {
		this.overreadRequired = overreadRequired;
	}

	public java.lang.String getMoc() {
		return this.moc;
	}

	public void setMoc(java.lang.String moc) {
		this.moc = moc;
	}

	public java.lang.String getQuery() {
		return this.query;
	}

	public void setQuery(java.lang.String query) {
		this.query = query;
	}

	public Chase(java.lang.String member, java.lang.String measure,
			java.lang.String status, java.lang.String user,
			java.lang.String previousUser, java.lang.Integer overreadRequired,
			java.lang.String query, java.lang.String moc) {
		this.member = member;
		this.measure = measure;
		this.status = status;
		this.user = user;
		this.previousUser = previousUser;
		this.overreadRequired = overreadRequired;
		this.query = query;
		this.moc = moc;
	}

}