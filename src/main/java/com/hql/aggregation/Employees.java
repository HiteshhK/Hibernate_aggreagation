package com.hql.aggregation;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employees {
	@Id 
	private int EMPLOYEE_ID;
	private String FIRST_NAME;
	private String LAST_NAME;
	private String EMAIL;
	private String PHONE_NUMBER;
	private Date HIRE_DATE;
	private String JOB_ID;
	private int SALARY;
	private Integer COMMISSION_PCT;
	private Integer MANAGER_ID;
	private Integer DEPARTMENT_ID;
	/**
	 * @return the eMPLOYEE_ID
	 */
	public int getEMPLOYEE_ID() {
		return EMPLOYEE_ID;
	}
	/**
	 * @param eMPLOYEE_ID the eMPLOYEE_ID to set
	 */
	public void setEMPLOYEE_ID(int eMPLOYEE_ID) {
		EMPLOYEE_ID = eMPLOYEE_ID;
	}
	/**
	 * @return the fIRST_NAME
	 */
	public String getFIRST_NAME() {
		return FIRST_NAME;
	}
	/**
	 * @param fIRST_NAME the fIRST_NAME to set
	 */
	public void setFIRST_NAME(String fIRST_NAME) {
		FIRST_NAME = fIRST_NAME;
	}
	/**
	 * @return the lAST_NAME
	 */
	public String getLAST_NAME() {
		return LAST_NAME;
	}
	/**
	 * @param lAST_NAME the lAST_NAME to set
	 */
	public void setLAST_NAME(String lAST_NAME) {
		LAST_NAME = lAST_NAME;
	}
	/**
	 * @return the eMAIL
	 */
	public String getEMAIL() {
		return EMAIL;
	}
	/**
	 * @param eMAIL the eMAIL to set
	 */
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	/**
	 * @return the pHONE_NUMBER
	 */
	public String getPHONE_NUMBER() {
		return PHONE_NUMBER;
	}
	/**
	 * @param pHONE_NUMBER the pHONE_NUMBER to set
	 */
	public void setPHONE_NUMBER(String pHONE_NUMBER) {
		PHONE_NUMBER = pHONE_NUMBER;
	}
	/**
	 * @return the hIRE_DATE
	 */
	public Date getHIRE_DATE() {
		return HIRE_DATE;
	}
	/**
	 * @param hIRE_DATE the hIRE_DATE to set
	 */
	public void setHIRE_DATE(Date hIRE_DATE) {
		
		/*if (hIRE_DATE != null) {
	        this.HIRE_DATE = new Date(hIRE_DATE.getTime());
	    } else {
	        this.HIRE_DATE = null;
	    }*/
		HIRE_DATE = hIRE_DATE;
	}
	/**
	 * @return the jOB_ID
	 */
	public String getJOB_ID() {
		return JOB_ID;
	}
	/**
	 * @param jOB_ID the jOB_ID to set
	 */
	public void setJOB_ID(String jOB_ID) {
		JOB_ID = jOB_ID;
	}
	/**
	 * @return the sALARY
	 */
	public int getSALARY() {
		return SALARY;
	}
	/**
	 * @param sALARY the sALARY to set
	 */
	public void setSALARY(int sALARY) {
		SALARY = sALARY;
	}
	/**
	 * @return the cOMMISSION_PCT
	 */
	public Integer getCOMMISSION_PCT() {
		return COMMISSION_PCT;
	}
	/**
	 * @param cOMMISSION_PCT the cOMMISSION_PCT to set
	 */
	public void setCOMMISSION_PCT(Integer cOMMISSION_PCT) {
		COMMISSION_PCT = cOMMISSION_PCT;
	}
	/**
	 * @return the mANAGER_ID
	 */
	public Integer getMANAGER_ID() {
		return MANAGER_ID;
	}
	/**
	 * @param mANAGER_ID the mANAGER_ID to set
	 */
	public void setMANAGER_ID(Integer mANAGER_ID) {
		MANAGER_ID = mANAGER_ID;
	}
	/**
	 * @return the dEPARTMENT_ID
	 */
	public Integer getDEPARTMENT_ID() {
		return DEPARTMENT_ID;
	}
	/**
	 * @param dEPARTMENT_ID the dEPARTMENT_ID to set
	 */
	public void setDEPARTMENT_ID(Integer dEPARTMENT_ID) {
		DEPARTMENT_ID = dEPARTMENT_ID;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employees [EMPLOYEE_ID=" + EMPLOYEE_ID + ", FIRST_NAME=" + FIRST_NAME + ", LAST_NAME=" + LAST_NAME
				+ ", EMAIL=" + EMAIL + ", \n PHONE_NUMBER=" + PHONE_NUMBER + ", HIRE_DATE=" + HIRE_DATE + ", JOB_ID="
				+ JOB_ID + ", SALARY=" + SALARY + ", \n COMMISSION_PCT=" + COMMISSION_PCT + ", MANAGER_ID=" + MANAGER_ID
				+ ", DEPARTMENT_ID=" + DEPARTMENT_ID + "]";
	}
	
}
