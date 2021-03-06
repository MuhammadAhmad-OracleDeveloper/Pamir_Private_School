package model.ERP.EO;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Apr 01 14:07:28 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblStdApplImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Id,
        StdRegId,
        Dated,
        ApplType,
        FeeGenDetailId,
        Amount,
        ApplStatus,
        FromDate,
        ToDate,
        ApplReason,
        MgtRemarks,
        PrincRemarks,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        CompanySbuId,
        GroupCompanyId;
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
    public static final int STDREGID = AttributesEnum.StdRegId.index();
    public static final int DATED = AttributesEnum.Dated.index();
    public static final int APPLTYPE = AttributesEnum.ApplType.index();
    public static final int FEEGENDETAILID = AttributesEnum.FeeGenDetailId.index();
    public static final int AMOUNT = AttributesEnum.Amount.index();
    public static final int APPLSTATUS = AttributesEnum.ApplStatus.index();
    public static final int FROMDATE = AttributesEnum.FromDate.index();
    public static final int TODATE = AttributesEnum.ToDate.index();
    public static final int APPLREASON = AttributesEnum.ApplReason.index();
    public static final int MGTREMARKS = AttributesEnum.MgtRemarks.index();
    public static final int PRINCREMARKS = AttributesEnum.PrincRemarks.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int COMPANYSBUID = AttributesEnum.CompanySbuId.index();
    public static final int GROUPCOMPANYID = AttributesEnum.GroupCompanyId.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblStdApplImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.ERP.EO.TblStdAppl");
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
     * Gets the attribute value for ApplType, using the alias name ApplType.
     * @return the value of ApplType
     */
    public String getApplType() {
        return (String) getAttributeInternal(APPLTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ApplType.
     * @param value value to set the ApplType
     */
    public void setApplType(String value) {
        setAttributeInternal(APPLTYPE, value);
    }

    /**
     * Gets the attribute value for FeeGenDetailId, using the alias name FeeGenDetailId.
     * @return the value of FeeGenDetailId
     */
    public BigDecimal getFeeGenDetailId() {
        return (BigDecimal) getAttributeInternal(FEEGENDETAILID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FeeGenDetailId.
     * @param value value to set the FeeGenDetailId
     */
    public void setFeeGenDetailId(BigDecimal value) {
        setAttributeInternal(FEEGENDETAILID, value);
    }

    /**
     * Gets the attribute value for Amount, using the alias name Amount.
     * @return the value of Amount
     */
    public BigDecimal getAmount() {
        return (BigDecimal) getAttributeInternal(AMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Amount.
     * @param value value to set the Amount
     */
    public void setAmount(BigDecimal value) {
        setAttributeInternal(AMOUNT, value);
    }

    /**
     * Gets the attribute value for ApplStatus, using the alias name ApplStatus.
     * @return the value of ApplStatus
     */
    public String getApplStatus() {
        return (String) getAttributeInternal(APPLSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for ApplStatus.
     * @param value value to set the ApplStatus
     */
    public void setApplStatus(String value) {
        setAttributeInternal(APPLSTATUS, value);
    }

    /**
     * Gets the attribute value for FromDate, using the alias name FromDate.
     * @return the value of FromDate
     */
    public Timestamp getFromDate() {
        return (Timestamp) getAttributeInternal(FROMDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for FromDate.
     * @param value value to set the FromDate
     */
    public void setFromDate(Timestamp value) {
        setAttributeInternal(FROMDATE, value);
    }

    /**
     * Gets the attribute value for ToDate, using the alias name ToDate.
     * @return the value of ToDate
     */
    public Timestamp getToDate() {
        return (Timestamp) getAttributeInternal(TODATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ToDate.
     * @param value value to set the ToDate
     */
    public void setToDate(Timestamp value) {
        setAttributeInternal(TODATE, value);
    }

    /**
     * Gets the attribute value for ApplReason, using the alias name ApplReason.
     * @return the value of ApplReason
     */
    public String getApplReason() {
        return (String) getAttributeInternal(APPLREASON);
    }

    /**
     * Sets <code>value</code> as the attribute value for ApplReason.
     * @param value value to set the ApplReason
     */
    public void setApplReason(String value) {
        setAttributeInternal(APPLREASON, value);
    }

    /**
     * Gets the attribute value for MgtRemarks, using the alias name MgtRemarks.
     * @return the value of MgtRemarks
     */
    public String getMgtRemarks() {
        return (String) getAttributeInternal(MGTREMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for MgtRemarks.
     * @param value value to set the MgtRemarks
     */
    public void setMgtRemarks(String value) {
        setAttributeInternal(MGTREMARKS, value);
    }

    /**
     * Gets the attribute value for PrincRemarks, using the alias name PrincRemarks.
     * @return the value of PrincRemarks
     */
    public String getPrincRemarks() {
        return (String) getAttributeInternal(PRINCREMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for PrincRemarks.
     * @param value value to set the PrincRemarks
     */
    public void setPrincRemarks(String value) {
        setAttributeInternal(PRINCREMARKS, value);
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
    public Number getCompanySbuId() {
        return (Number) getAttributeInternal(COMPANYSBUID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CompanySbuId.
     * @param value value to set the CompanySbuId
     */
    public void setCompanySbuId(Number value) {
        setAttributeInternal(COMPANYSBUID, value);
    }


    /**
     * Gets the attribute value for GroupCompanyId, using the alias name GroupCompanyId.
     * @return the value of GroupCompanyId
     */
    public Number getGroupCompanyId() {
        return (Number) getAttributeInternal(GROUPCOMPANYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for GroupCompanyId.
     * @param value value to set the GroupCompanyId
     */
    public void setGroupCompanyId(Number value) {
        setAttributeInternal(GROUPCOMPANYID, value);
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
        Number userId = null;
        Number cmpnyId = null;
        Number sbuId = null;
         try {
             userId = new Number((String) ADFContext.getCurrent().getSessionScope().get("sessUMID"));
             cmpnyId = new Number((String) ADFContext.getCurrent().getSessionScope().get("sessCmpnyID"));
             sbuId = new Number((String) ADFContext.getCurrent().getSessionScope().get("sessSBUID"));
         } catch(Exception ex) {
             ex.printStackTrace();
         }
         
         if (operation == DML_INSERT) {

             setGroupCompanyId(cmpnyId);
             setCompanySbuId(sbuId);

             setCreatedBy(userId);
             setUpdatedBy(userId);
             } else if(operation == DML_UPDATE) {
             
             setGroupCompanyId(cmpnyId);
             setCompanySbuId(sbuId);
             
             setUpdatedBy(userId);
         }
        super.doDML(operation, e);

    }
}

