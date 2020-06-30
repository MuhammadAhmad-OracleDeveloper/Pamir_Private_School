package model.ERP.EO;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.domain.NClobDomain;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Mar 18 23:12:15 PDT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblStaffKinImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Id,
        StaffId,
        Dated,
        Name,
        KinRel,
        ContactNo,
        Address,
        Mobile1,
        Mobile2,
        Ast,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        TblStaff;
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
    public static final int STAFFID = AttributesEnum.StaffId.index();
    public static final int DATED = AttributesEnum.Dated.index();
    public static final int NAME = AttributesEnum.Name.index();
    public static final int KINREL = AttributesEnum.KinRel.index();
    public static final int CONTACTNO = AttributesEnum.ContactNo.index();
    public static final int ADDRESS = AttributesEnum.Address.index();
    public static final int MOBILE1 = AttributesEnum.Mobile1.index();
    public static final int MOBILE2 = AttributesEnum.Mobile2.index();
    public static final int AST = AttributesEnum.Ast.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int TBLSTAFF = AttributesEnum.TblStaff.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblStaffKinImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.ERP.EO.TblStaffKin");
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
     * Gets the attribute value for StaffId, using the alias name StaffId.
     * @return the value of StaffId
     */
    public BigDecimal getStaffId() {
        return (BigDecimal) getAttributeInternal(STAFFID);
    }

    /**
     * Sets <code>value</code> as the attribute value for StaffId.
     * @param value value to set the StaffId
     */
    public void setStaffId(BigDecimal value) {
        setAttributeInternal(STAFFID, value);
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
     * Gets the attribute value for Name, using the alias name Name.
     * @return the value of Name
     */
    public String getName() {
        return (String) getAttributeInternal(NAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for Name.
     * @param value value to set the Name
     */
    public void setName(String value) {
        setAttributeInternal(NAME, value);
    }

    /**
     * Gets the attribute value for KinRel, using the alias name KinRel.
     * @return the value of KinRel
     */
    public Number getKinRel() {
        return (Number) getAttributeInternal(KINREL);
    }

    /**
     * Sets <code>value</code> as the attribute value for KinRel.
     * @param value value to set the KinRel
     */
    public void setKinRel(Number value) {
        setAttributeInternal(KINREL, value);
    }

    /**
     * Gets the attribute value for ContactNo, using the alias name ContactNo.
     * @return the value of ContactNo
     */
    public String getContactNo() {
        return (String) getAttributeInternal(CONTACTNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ContactNo.
     * @param value value to set the ContactNo
     */
    public void setContactNo(String value) {
        setAttributeInternal(CONTACTNO, value);
    }

    /**
     * Gets the attribute value for Address, using the alias name Address.
     * @return the value of Address
     */
    public String getAddress() {
        return (String) getAttributeInternal(ADDRESS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Address.
     * @param value value to set the Address
     */
    public void setAddress(String value) {
        setAttributeInternal(ADDRESS, value);
    }

    /**
     * Gets the attribute value for Mobile1, using the alias name Mobile1.
     * @return the value of Mobile1
     */
    public String getMobile1() {
        return (String) getAttributeInternal(MOBILE1);
    }

    /**
     * Sets <code>value</code> as the attribute value for Mobile1.
     * @param value value to set the Mobile1
     */
    public void setMobile1(String value) {
        setAttributeInternal(MOBILE1, value);
    }

    /**
     * Gets the attribute value for Mobile2, using the alias name Mobile2.
     * @return the value of Mobile2
     */
    public String getMobile2() {
        return (String) getAttributeInternal(MOBILE2);
    }

    /**
     * Sets <code>value</code> as the attribute value for Mobile2.
     * @param value value to set the Mobile2
     */
    public void setMobile2(String value) {
        setAttributeInternal(MOBILE2, value);
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
     * @return the associated entity TblStaffImpl.
     */
    public TblStaffImpl getTblStaff() {
        return (TblStaffImpl) getAttributeInternal(TBLSTAFF);
    }

    /**
     * Sets <code>value</code> as the associated entity TblStaffImpl.
     */
    public void setTblStaff(TblStaffImpl value) {
        setAttributeInternal(TBLSTAFF, value);
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

