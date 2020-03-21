package model.ERP.EO;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Mar 18 23:06:02 PDT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblStaffImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Id,
        GroupCompanyId,
        Dated,
        JobStatus,
        LookupSalutation,
        FirstName,
        LastName,
        Gender,
        Dob,
        Doj,
        LookupNationality,
        LookupReligion,
        LookupStaffType,
        CurrAddress,
        PerAddress,
        PersonalMobile,
        ResPhone,
        PersonalEmail,
        OtherContact,
        Image,
        EmirId,
        LookupRefBy,
        Ast,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        LicenseExp,
        LicenseNo,
        TblLookupDetail,
        TblLookupDetail1,
        TblLookupDetail2,
        TblLookupDetail3,
        TblLookupDetail4,
        TblStaffBenefit,
        TblStaffDepartment,
        TblStaffDesignation,
        TblStaffExpr,
        TblStaffKin,
        TblStaffPassport,
        TblStaffRole,
        TblStaffSalary,
        TblStaffVisa,
        TblStaffSubject;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }

    public static final int ID = AttributesEnum.Id.index();
    public static final int GROUPCOMPANYID = AttributesEnum.GroupCompanyId.index();
    public static final int DATED = AttributesEnum.Dated.index();
    public static final int JOBSTATUS = AttributesEnum.JobStatus.index();
    public static final int LOOKUPSALUTATION = AttributesEnum.LookupSalutation.index();
    public static final int FIRSTNAME = AttributesEnum.FirstName.index();
    public static final int LASTNAME = AttributesEnum.LastName.index();
    public static final int GENDER = AttributesEnum.Gender.index();
    public static final int DOB = AttributesEnum.Dob.index();
    public static final int DOJ = AttributesEnum.Doj.index();
    public static final int LOOKUPNATIONALITY = AttributesEnum.LookupNationality.index();
    public static final int LOOKUPRELIGION = AttributesEnum.LookupReligion.index();
    public static final int LOOKUPSTAFFTYPE = AttributesEnum.LookupStaffType.index();
    public static final int CURRADDRESS = AttributesEnum.CurrAddress.index();
    public static final int PERADDRESS = AttributesEnum.PerAddress.index();
    public static final int PERSONALMOBILE = AttributesEnum.PersonalMobile.index();
    public static final int RESPHONE = AttributesEnum.ResPhone.index();
    public static final int PERSONALEMAIL = AttributesEnum.PersonalEmail.index();
    public static final int OTHERCONTACT = AttributesEnum.OtherContact.index();
    public static final int IMAGE = AttributesEnum.Image.index();
    public static final int EMIRID = AttributesEnum.EmirId.index();
    public static final int LOOKUPREFBY = AttributesEnum.LookupRefBy.index();
    public static final int AST = AttributesEnum.Ast.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int LICENSEEXP = AttributesEnum.LicenseExp.index();
    public static final int LICENSENO = AttributesEnum.LicenseNo.index();
    public static final int TBLLOOKUPDETAIL = AttributesEnum.TblLookupDetail.index();
    public static final int TBLLOOKUPDETAIL1 = AttributesEnum.TblLookupDetail1.index();
    public static final int TBLLOOKUPDETAIL2 = AttributesEnum.TblLookupDetail2.index();
    public static final int TBLLOOKUPDETAIL3 = AttributesEnum.TblLookupDetail3.index();
    public static final int TBLLOOKUPDETAIL4 = AttributesEnum.TblLookupDetail4.index();
    public static final int TBLSTAFFBENEFIT = AttributesEnum.TblStaffBenefit.index();
    public static final int TBLSTAFFDEPARTMENT = AttributesEnum.TblStaffDepartment.index();
    public static final int TBLSTAFFDESIGNATION = AttributesEnum.TblStaffDesignation.index();
    public static final int TBLSTAFFEXPR = AttributesEnum.TblStaffExpr.index();
    public static final int TBLSTAFFKIN = AttributesEnum.TblStaffKin.index();
    public static final int TBLSTAFFPASSPORT = AttributesEnum.TblStaffPassport.index();
    public static final int TBLSTAFFROLE = AttributesEnum.TblStaffRole.index();
    public static final int TBLSTAFFSALARY = AttributesEnum.TblStaffSalary.index();
    public static final int TBLSTAFFVISA = AttributesEnum.TblStaffVisa.index();
    public static final int TBLSTAFFSUBJECT = AttributesEnum.TblStaffSubject.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblStaffImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.ERP.EO.TblStaff");
    }

    /**
     * Gets the attribute value for Id, using the alias name Id.
     * @return the value of Id
     */
    public BigDecimal getId() {
        return (BigDecimal) getAttributeInternal(ID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Id.
     * @param value value to set the Id
     */
    public void setId(BigDecimal value) {
        setAttributeInternal(ID, value);
    }

    /**
     * Gets the attribute value for GroupCompanyId, using the alias name GroupCompanyId.
     * @return the value of GroupCompanyId
     */
    public BigDecimal getGroupCompanyId() {
        return (BigDecimal) getAttributeInternal(GROUPCOMPANYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for GroupCompanyId.
     * @param value value to set the GroupCompanyId
     */
    public void setGroupCompanyId(BigDecimal value) {
        setAttributeInternal(GROUPCOMPANYID, value);
    }

    /**
     * Gets the attribute value for Dated, using the alias name Dated.
     * @return the value of Dated
     */
    public Timestamp getDated() {
        return (Timestamp) getAttributeInternal(DATED);
    }

    /**
     * Sets <code>value</code> as the attribute value for Dated.
     * @param value value to set the Dated
     */
    public void setDated(Timestamp value) {
        setAttributeInternal(DATED, value);
    }

    /**
     * Gets the attribute value for JobStatus, using the alias name JobStatus.
     * @return the value of JobStatus
     */
    public String getJobStatus() {
        return (String) getAttributeInternal(JOBSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for JobStatus.
     * @param value value to set the JobStatus
     */
    public void setJobStatus(String value) {
        setAttributeInternal(JOBSTATUS, value);
    }

    /**
     * Gets the attribute value for LookupSalutation, using the alias name LookupSalutation.
     * @return the value of LookupSalutation
     */
    public BigDecimal getLookupSalutation() {
        return (BigDecimal) getAttributeInternal(LOOKUPSALUTATION);
    }

    /**
     * Sets <code>value</code> as the attribute value for LookupSalutation.
     * @param value value to set the LookupSalutation
     */
    public void setLookupSalutation(BigDecimal value) {
        setAttributeInternal(LOOKUPSALUTATION, value);
    }

    /**
     * Gets the attribute value for FirstName, using the alias name FirstName.
     * @return the value of FirstName
     */
    public String getFirstName() {
        return (String) getAttributeInternal(FIRSTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for FirstName.
     * @param value value to set the FirstName
     */
    public void setFirstName(String value) {
        setAttributeInternal(FIRSTNAME, value);
    }

    /**
     * Gets the attribute value for LastName, using the alias name LastName.
     * @return the value of LastName
     */
    public String getLastName() {
        return (String) getAttributeInternal(LASTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastName.
     * @param value value to set the LastName
     */
    public void setLastName(String value) {
        setAttributeInternal(LASTNAME, value);
    }

    /**
     * Gets the attribute value for Gender, using the alias name Gender.
     * @return the value of Gender
     */
    public String getGender() {
        return (String) getAttributeInternal(GENDER);
    }

    /**
     * Sets <code>value</code> as the attribute value for Gender.
     * @param value value to set the Gender
     */
    public void setGender(String value) {
        setAttributeInternal(GENDER, value);
    }

    /**
     * Gets the attribute value for Dob, using the alias name Dob.
     * @return the value of Dob
     */
    public Timestamp getDob() {
        return (Timestamp) getAttributeInternal(DOB);
    }

    /**
     * Sets <code>value</code> as the attribute value for Dob.
     * @param value value to set the Dob
     */
    public void setDob(Timestamp value) {
        setAttributeInternal(DOB, value);
    }

    /**
     * Gets the attribute value for Doj, using the alias name Doj.
     * @return the value of Doj
     */
    public Timestamp getDoj() {
        return (Timestamp) getAttributeInternal(DOJ);
    }

    /**
     * Sets <code>value</code> as the attribute value for Doj.
     * @param value value to set the Doj
     */
    public void setDoj(Timestamp value) {
        setAttributeInternal(DOJ, value);
    }

    /**
     * Gets the attribute value for LookupNationality, using the alias name LookupNationality.
     * @return the value of LookupNationality
     */
    public BigDecimal getLookupNationality() {
        return (BigDecimal) getAttributeInternal(LOOKUPNATIONALITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LookupNationality.
     * @param value value to set the LookupNationality
     */
    public void setLookupNationality(BigDecimal value) {
        setAttributeInternal(LOOKUPNATIONALITY, value);
    }

    /**
     * Gets the attribute value for LookupReligion, using the alias name LookupReligion.
     * @return the value of LookupReligion
     */
    public BigDecimal getLookupReligion() {
        return (BigDecimal) getAttributeInternal(LOOKUPRELIGION);
    }

    /**
     * Sets <code>value</code> as the attribute value for LookupReligion.
     * @param value value to set the LookupReligion
     */
    public void setLookupReligion(BigDecimal value) {
        setAttributeInternal(LOOKUPRELIGION, value);
    }

    /**
     * Gets the attribute value for LookupStaffType, using the alias name LookupStaffType.
     * @return the value of LookupStaffType
     */
    public BigDecimal getLookupStaffType() {
        return (BigDecimal) getAttributeInternal(LOOKUPSTAFFTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LookupStaffType.
     * @param value value to set the LookupStaffType
     */
    public void setLookupStaffType(BigDecimal value) {
        setAttributeInternal(LOOKUPSTAFFTYPE, value);
    }

    /**
     * Gets the attribute value for CurrAddress, using the alias name CurrAddress.
     * @return the value of CurrAddress
     */
    public String getCurrAddress() {
        return (String) getAttributeInternal(CURRADDRESS);
    }

    /**
     * Sets <code>value</code> as the attribute value for CurrAddress.
     * @param value value to set the CurrAddress
     */
    public void setCurrAddress(String value) {
        setAttributeInternal(CURRADDRESS, value);
    }

    /**
     * Gets the attribute value for PerAddress, using the alias name PerAddress.
     * @return the value of PerAddress
     */
    public String getPerAddress() {
        return (String) getAttributeInternal(PERADDRESS);
    }

    /**
     * Sets <code>value</code> as the attribute value for PerAddress.
     * @param value value to set the PerAddress
     */
    public void setPerAddress(String value) {
        setAttributeInternal(PERADDRESS, value);
    }

    /**
     * Gets the attribute value for PersonalMobile, using the alias name PersonalMobile.
     * @return the value of PersonalMobile
     */
    public String getPersonalMobile() {
        return (String) getAttributeInternal(PERSONALMOBILE);
    }

    /**
     * Sets <code>value</code> as the attribute value for PersonalMobile.
     * @param value value to set the PersonalMobile
     */
    public void setPersonalMobile(String value) {
        setAttributeInternal(PERSONALMOBILE, value);
    }

    /**
     * Gets the attribute value for ResPhone, using the alias name ResPhone.
     * @return the value of ResPhone
     */
    public String getResPhone() {
        return (String) getAttributeInternal(RESPHONE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ResPhone.
     * @param value value to set the ResPhone
     */
    public void setResPhone(String value) {
        setAttributeInternal(RESPHONE, value);
    }

    /**
     * Gets the attribute value for PersonalEmail, using the alias name PersonalEmail.
     * @return the value of PersonalEmail
     */
    public String getPersonalEmail() {
        return (String) getAttributeInternal(PERSONALEMAIL);
    }

    /**
     * Sets <code>value</code> as the attribute value for PersonalEmail.
     * @param value value to set the PersonalEmail
     */
    public void setPersonalEmail(String value) {
        setAttributeInternal(PERSONALEMAIL, value);
    }

    /**
     * Gets the attribute value for OtherContact, using the alias name OtherContact.
     * @return the value of OtherContact
     */
    public String getOtherContact() {
        return (String) getAttributeInternal(OTHERCONTACT);
    }

    /**
     * Sets <code>value</code> as the attribute value for OtherContact.
     * @param value value to set the OtherContact
     */
    public void setOtherContact(String value) {
        setAttributeInternal(OTHERCONTACT, value);
    }

    /**
     * Gets the attribute value for Image, using the alias name Image.
     * @return the value of Image
     */
    public String getImage() {
        return (String) getAttributeInternal(IMAGE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Image.
     * @param value value to set the Image
     */
    public void setImage(String value) {
        setAttributeInternal(IMAGE, value);
    }

    /**
     * Gets the attribute value for EmirId, using the alias name EmirId.
     * @return the value of EmirId
     */
    public String getEmirId() {
        return (String) getAttributeInternal(EMIRID);
    }

    /**
     * Sets <code>value</code> as the attribute value for EmirId.
     * @param value value to set the EmirId
     */
    public void setEmirId(String value) {
        setAttributeInternal(EMIRID, value);
    }

    /**
     * Gets the attribute value for LookupRefBy, using the alias name LookupRefBy.
     * @return the value of LookupRefBy
     */
    public BigDecimal getLookupRefBy() {
        return (BigDecimal) getAttributeInternal(LOOKUPREFBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LookupRefBy.
     * @param value value to set the LookupRefBy
     */
    public void setLookupRefBy(BigDecimal value) {
        setAttributeInternal(LOOKUPREFBY, value);
    }

    /**
     * Gets the attribute value for Ast, using the alias name Ast.
     * @return the value of Ast
     */
    public String getAst() {
        return (String) getAttributeInternal(AST);
    }

    /**
     * Sets <code>value</code> as the attribute value for Ast.
     * @param value value to set the Ast
     */
    public void setAst(String value) {
        setAttributeInternal(AST, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public Number getCreatedBy() {
        return (Number) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for UpdatedDate, using the alias name UpdatedDate.
     * @return the value of UpdatedDate
     */
    public Timestamp getUpdatedDate() {
        return (Timestamp) getAttributeInternal(UPDATEDDATE);
    }

    /**
     * Gets the attribute value for UpdatedBy, using the alias name UpdatedBy.
     * @return the value of UpdatedBy
     */
    public Number getUpdatedBy() {
        return (Number) getAttributeInternal(UPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for UpdatedBy.
     * @param value value to set the UpdatedBy
     */
    public void setUpdatedBy(Number value) {
        setAttributeInternal(UPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LicenseExp, using the alias name LicenseExp.
     * @return the value of LicenseExp
     */
    public Timestamp getLicenseExp() {
        return (Timestamp) getAttributeInternal(LICENSEEXP);
    }

    /**
     * Sets <code>value</code> as the attribute value for LicenseExp.
     * @param value value to set the LicenseExp
     */
    public void setLicenseExp(Timestamp value) {
        setAttributeInternal(LICENSEEXP, value);
    }

    /**
     * Gets the attribute value for LicenseNo, using the alias name LicenseNo.
     * @return the value of LicenseNo
     */
    public String getLicenseNo() {
        return (String) getAttributeInternal(LICENSENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for LicenseNo.
     * @param value value to set the LicenseNo
     */
    public void setLicenseNo(String value) {
        setAttributeInternal(LICENSENO, value);
    }

    /**
     * @return the associated entity TblLookupDetailImpl.
     */
    public TblLookupDetailImpl getTblLookupDetail() {
        return (TblLookupDetailImpl) getAttributeInternal(TBLLOOKUPDETAIL);
    }

    /**
     * Sets <code>value</code> as the associated entity TblLookupDetailImpl.
     */
    public void setTblLookupDetail(TblLookupDetailImpl value) {
        setAttributeInternal(TBLLOOKUPDETAIL, value);
    }

    /**
     * @return the associated entity TblLookupDetailImpl.
     */
    public TblLookupDetailImpl getTblLookupDetail1() {
        return (TblLookupDetailImpl) getAttributeInternal(TBLLOOKUPDETAIL1);
    }

    /**
     * Sets <code>value</code> as the associated entity TblLookupDetailImpl.
     */
    public void setTblLookupDetail1(TblLookupDetailImpl value) {
        setAttributeInternal(TBLLOOKUPDETAIL1, value);
    }

    /**
     * @return the associated entity TblLookupDetailImpl.
     */
    public TblLookupDetailImpl getTblLookupDetail2() {
        return (TblLookupDetailImpl) getAttributeInternal(TBLLOOKUPDETAIL2);
    }

    /**
     * Sets <code>value</code> as the associated entity TblLookupDetailImpl.
     */
    public void setTblLookupDetail2(TblLookupDetailImpl value) {
        setAttributeInternal(TBLLOOKUPDETAIL2, value);
    }

    /**
     * @return the associated entity TblLookupDetailImpl.
     */
    public TblLookupDetailImpl getTblLookupDetail3() {
        return (TblLookupDetailImpl) getAttributeInternal(TBLLOOKUPDETAIL3);
    }

    /**
     * Sets <code>value</code> as the associated entity TblLookupDetailImpl.
     */
    public void setTblLookupDetail3(TblLookupDetailImpl value) {
        setAttributeInternal(TBLLOOKUPDETAIL3, value);
    }

    /**
     * @return the associated entity TblLookupDetailImpl.
     */
    public TblLookupDetailImpl getTblLookupDetail4() {
        return (TblLookupDetailImpl) getAttributeInternal(TBLLOOKUPDETAIL4);
    }

    /**
     * Sets <code>value</code> as the associated entity TblLookupDetailImpl.
     */
    public void setTblLookupDetail4(TblLookupDetailImpl value) {
        setAttributeInternal(TBLLOOKUPDETAIL4, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblStaffBenefit() {
        return (RowIterator) getAttributeInternal(TBLSTAFFBENEFIT);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblStaffDepartment() {
        return (RowIterator) getAttributeInternal(TBLSTAFFDEPARTMENT);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblStaffDesignation() {
        return (RowIterator) getAttributeInternal(TBLSTAFFDESIGNATION);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblStaffExpr() {
        return (RowIterator) getAttributeInternal(TBLSTAFFEXPR);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblStaffKin() {
        return (RowIterator) getAttributeInternal(TBLSTAFFKIN);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblStaffPassport() {
        return (RowIterator) getAttributeInternal(TBLSTAFFPASSPORT);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblStaffRole() {
        return (RowIterator) getAttributeInternal(TBLSTAFFROLE);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblStaffSalary() {
        return (RowIterator) getAttributeInternal(TBLSTAFFSALARY);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblStaffVisa() {
        return (RowIterator) getAttributeInternal(TBLSTAFFVISA);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblStaffSubject() {
        return (RowIterator) getAttributeInternal(TBLSTAFFSUBJECT);
    }


    /**
     * @param id key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal id) {
        return new Key(new Object[] { id });
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        Number loginId = null;
                 try {
                     loginId = new Number((String) ADFContext.getCurrent().getSessionScope().get("sessRID"));
                 } catch(Exception ex) {
                     ex.printStackTrace();
                 }
                 
                 if (operation == DML_INSERT) {
                     setCreatedBy(loginId);
                     setUpdatedBy(loginId);
                     } else if(operation == DML_UPDATE) {
                     setUpdatedBy(loginId);
                 }
        super.doDML(operation, e);
    }
}

