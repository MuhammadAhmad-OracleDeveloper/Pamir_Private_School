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
// ---    Wed Mar 18 22:39:01 PDT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblAgePolicyImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Id,
        GroupCompanyId,
        AcadYearId,
        Dated,
        GradeId,
        FrYear,
        ToYear,
        Ast,
        RefDocNo,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        TblAcadYear,
        TblGrade;
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
    public static final int ACADYEARID = AttributesEnum.AcadYearId.index();
    public static final int DATED = AttributesEnum.Dated.index();
    public static final int GRADEID = AttributesEnum.GradeId.index();
    public static final int FRYEAR = AttributesEnum.FrYear.index();
    public static final int TOYEAR = AttributesEnum.ToYear.index();
    public static final int AST = AttributesEnum.Ast.index();
    public static final int REFDOCNO = AttributesEnum.RefDocNo.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int TBLACADYEAR = AttributesEnum.TblAcadYear.index();
    public static final int TBLGRADE = AttributesEnum.TblGrade.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblAgePolicyImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.ERP.EO.TblAgePolicy");
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
     * Gets the attribute value for AcadYearId, using the alias name AcadYearId.
     * @return the value of AcadYearId
     */
    public BigDecimal getAcadYearId() {
        return (BigDecimal) getAttributeInternal(ACADYEARID);
    }

    /**
     * Sets <code>value</code> as the attribute value for AcadYearId.
     * @param value value to set the AcadYearId
     */
    public void setAcadYearId(BigDecimal value) {
        setAttributeInternal(ACADYEARID, value);
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
     * Gets the attribute value for GradeId, using the alias name GradeId.
     * @return the value of GradeId
     */
    public BigDecimal getGradeId() {
        return (BigDecimal) getAttributeInternal(GRADEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for GradeId.
     * @param value value to set the GradeId
     */
    public void setGradeId(BigDecimal value) {
        setAttributeInternal(GRADEID, value);
    }

    /**
     * Gets the attribute value for FrYear, using the alias name FrYear.
     * @return the value of FrYear
     */
    public BigDecimal getFrYear() {
        return (BigDecimal) getAttributeInternal(FRYEAR);
    }

    /**
     * Sets <code>value</code> as the attribute value for FrYear.
     * @param value value to set the FrYear
     */
    public void setFrYear(BigDecimal value) {
        setAttributeInternal(FRYEAR, value);
    }

    /**
     * Gets the attribute value for ToYear, using the alias name ToYear.
     * @return the value of ToYear
     */
    public BigDecimal getToYear() {
        return (BigDecimal) getAttributeInternal(TOYEAR);
    }

    /**
     * Sets <code>value</code> as the attribute value for ToYear.
     * @param value value to set the ToYear
     */
    public void setToYear(BigDecimal value) {
        setAttributeInternal(TOYEAR, value);
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
     * Gets the attribute value for RefDocNo, using the alias name RefDocNo.
     * @return the value of RefDocNo
     */
    public String getRefDocNo() {
        return (String) getAttributeInternal(REFDOCNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for RefDocNo.
     * @param value value to set the RefDocNo
     */
    public void setRefDocNo(String value) {
        setAttributeInternal(REFDOCNO, value);
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
    public oracle.jbo.domain.Number getCreatedBy() {
        return (oracle.jbo.domain.Number) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(oracle.jbo.domain.Number value) {
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
     * @return the associated entity TblAcadYearImpl.
     */
    public TblAcadYearImpl getTblAcadYear() {
        return (TblAcadYearImpl) getAttributeInternal(TBLACADYEAR);
    }

    /**
     * Sets <code>value</code> as the associated entity TblAcadYearImpl.
     */
    public void setTblAcadYear(TblAcadYearImpl value) {
        setAttributeInternal(TBLACADYEAR, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getTblGrade() {
        return (EntityImpl) getAttributeInternal(TBLGRADE);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblGrade(EntityImpl value) {
        setAttributeInternal(TBLGRADE, value);
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

