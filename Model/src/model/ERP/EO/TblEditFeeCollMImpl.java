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
// ---    Tue Sep 08 16:38:10 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblEditFeeCollMImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Id,
        AcadYearId,
        GradeId,
        SectionsId,
        TermsId,
        StdRegId,
        Dated,
        GroupCompanyId,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        CompanySbuId,
        TblEditFeeCollD;
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
    public static final int ACADYEARID = AttributesEnum.AcadYearId.index();
    public static final int GRADEID = AttributesEnum.GradeId.index();
    public static final int SECTIONSID = AttributesEnum.SectionsId.index();
    public static final int TERMSID = AttributesEnum.TermsId.index();
    public static final int STDREGID = AttributesEnum.StdRegId.index();
    public static final int DATED = AttributesEnum.Dated.index();
    public static final int GROUPCOMPANYID = AttributesEnum.GroupCompanyId.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int COMPANYSBUID = AttributesEnum.CompanySbuId.index();
    public static final int TBLEDITFEECOLLD = AttributesEnum.TblEditFeeCollD.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblEditFeeCollMImpl() {
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
     * Gets the attribute value for SectionsId, using the alias name SectionsId.
     * @return the value of SectionsId
     */
    public BigDecimal getSectionsId() {
        return (BigDecimal) getAttributeInternal(SECTIONSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SectionsId.
     * @param value value to set the SectionsId
     */
    public void setSectionsId(BigDecimal value) {
        setAttributeInternal(SECTIONSID, value);
    }

    /**
     * Gets the attribute value for TermsId, using the alias name TermsId.
     * @return the value of TermsId
     */
    public BigDecimal getTermsId() {
        return (BigDecimal) getAttributeInternal(TERMSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TermsId.
     * @param value value to set the TermsId
     */
    public void setTermsId(BigDecimal value) {
        setAttributeInternal(TERMSID, value);
    }

    /**
     * Gets the attribute value for StdRegId, using the alias name StdRegId.
     * @return the value of StdRegId
     */
    public BigDecimal getStdRegId() {
        return (BigDecimal) getAttributeInternal(STDREGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for StdRegId.
     * @param value value to set the StdRegId
     */
    public void setStdRegId(BigDecimal value) {
        setAttributeInternal(STDREGID, value);
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
     * Gets the attribute value for CompanySbuId, using the alias name CompanySbuId.
     * @return the value of CompanySbuId
     */
    public BigDecimal getCompanySbuId() {
        return (BigDecimal) getAttributeInternal(COMPANYSBUID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CompanySbuId.
     * @param value value to set the CompanySbuId
     */
    public void setCompanySbuId(BigDecimal value) {
        setAttributeInternal(COMPANYSBUID, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblEditFeeCollD() {
        return (RowIterator) getAttributeInternal(TBLEDITFEECOLLD);
    }

    /**
     * @param id key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal id) {
        return new Key(new Object[] { id });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.ERP.EO.TblEditFeeCollM");
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
                           loginId = new Number((String) ADFContext.getCurrent().getSessionScope().get("sessUMID"));
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

