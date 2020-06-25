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
// ---    Thu Jun 25 14:15:34 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblInvVoucherDetailImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Id,
        InvVoucherMasterId,
        SrNo,
        ItemL4Id,
        UomId,
        Description,
        Qty,
        DoQty,
        PoQty,
        IgpQty,
        QcQty,
        GrnQty,
        Rate,
        RateFc,
        Amount,
        AmountFc,
        LandedCost,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        TblInvVoucherMaster;
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
    public static final int INVVOUCHERMASTERID = AttributesEnum.InvVoucherMasterId.index();
    public static final int SRNO = AttributesEnum.SrNo.index();
    public static final int ITEML4ID = AttributesEnum.ItemL4Id.index();
    public static final int UOMID = AttributesEnum.UomId.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int QTY = AttributesEnum.Qty.index();
    public static final int DOQTY = AttributesEnum.DoQty.index();
    public static final int POQTY = AttributesEnum.PoQty.index();
    public static final int IGPQTY = AttributesEnum.IgpQty.index();
    public static final int QCQTY = AttributesEnum.QcQty.index();
    public static final int GRNQTY = AttributesEnum.GrnQty.index();
    public static final int RATE = AttributesEnum.Rate.index();
    public static final int RATEFC = AttributesEnum.RateFc.index();
    public static final int AMOUNT = AttributesEnum.Amount.index();
    public static final int AMOUNTFC = AttributesEnum.AmountFc.index();
    public static final int LANDEDCOST = AttributesEnum.LandedCost.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int TBLINVVOUCHERMASTER = AttributesEnum.TblInvVoucherMaster.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblInvVoucherDetailImpl() {
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
     * Gets the attribute value for InvVoucherMasterId, using the alias name InvVoucherMasterId.
     * @return the value of InvVoucherMasterId
     */
    public BigDecimal getInvVoucherMasterId() {
        return (BigDecimal) getAttributeInternal(INVVOUCHERMASTERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for InvVoucherMasterId.
     * @param value value to set the InvVoucherMasterId
     */
    public void setInvVoucherMasterId(BigDecimal value) {
        setAttributeInternal(INVVOUCHERMASTERID, value);
    }

    /**
     * Gets the attribute value for SrNo, using the alias name SrNo.
     * @return the value of SrNo
     */
    public Integer getSrNo() {
        return (Integer) getAttributeInternal(SRNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for SrNo.
     * @param value value to set the SrNo
     */
    public void setSrNo(Integer value) {
        setAttributeInternal(SRNO, value);
    }

    /**
     * Gets the attribute value for ItemL4Id, using the alias name ItemL4Id.
     * @return the value of ItemL4Id
     */
    public BigDecimal getItemL4Id() {
        return (BigDecimal) getAttributeInternal(ITEML4ID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItemL4Id.
     * @param value value to set the ItemL4Id
     */
    public void setItemL4Id(BigDecimal value) {
        setAttributeInternal(ITEML4ID, value);
    }

    /**
     * Gets the attribute value for UomId, using the alias name UomId.
     * @return the value of UomId
     */
    public BigDecimal getUomId() {
        return (BigDecimal) getAttributeInternal(UOMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for UomId.
     * @param value value to set the UomId
     */
    public void setUomId(BigDecimal value) {
        setAttributeInternal(UOMID, value);
    }

    /**
     * Gets the attribute value for Description, using the alias name Description.
     * @return the value of Description
     */
    public String getDescription() {
        return (String) getAttributeInternal(DESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Description.
     * @param value value to set the Description
     */
    public void setDescription(String value) {
        setAttributeInternal(DESCRIPTION, value);
    }

    /**
     * Gets the attribute value for Qty, using the alias name Qty.
     * @return the value of Qty
     */
    public BigDecimal getQty() {
        return (BigDecimal) getAttributeInternal(QTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Qty.
     * @param value value to set the Qty
     */
    public void setQty(BigDecimal value) {
        setAttributeInternal(QTY, value);
    }

    /**
     * Gets the attribute value for DoQty, using the alias name DoQty.
     * @return the value of DoQty
     */
    public BigDecimal getDoQty() {
        return (BigDecimal) getAttributeInternal(DOQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for DoQty.
     * @param value value to set the DoQty
     */
    public void setDoQty(BigDecimal value) {
        setAttributeInternal(DOQTY, value);
    }

    /**
     * Gets the attribute value for PoQty, using the alias name PoQty.
     * @return the value of PoQty
     */
    public BigDecimal getPoQty() {
        return (BigDecimal) getAttributeInternal(POQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for PoQty.
     * @param value value to set the PoQty
     */
    public void setPoQty(BigDecimal value) {
        setAttributeInternal(POQTY, value);
    }

    /**
     * Gets the attribute value for IgpQty, using the alias name IgpQty.
     * @return the value of IgpQty
     */
    public BigDecimal getIgpQty() {
        return (BigDecimal) getAttributeInternal(IGPQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for IgpQty.
     * @param value value to set the IgpQty
     */
    public void setIgpQty(BigDecimal value) {
        setAttributeInternal(IGPQTY, value);
    }

    /**
     * Gets the attribute value for QcQty, using the alias name QcQty.
     * @return the value of QcQty
     */
    public BigDecimal getQcQty() {
        return (BigDecimal) getAttributeInternal(QCQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for QcQty.
     * @param value value to set the QcQty
     */
    public void setQcQty(BigDecimal value) {
        setAttributeInternal(QCQTY, value);
    }

    /**
     * Gets the attribute value for GrnQty, using the alias name GrnQty.
     * @return the value of GrnQty
     */
    public BigDecimal getGrnQty() {
        return (BigDecimal) getAttributeInternal(GRNQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for GrnQty.
     * @param value value to set the GrnQty
     */
    public void setGrnQty(BigDecimal value) {
        setAttributeInternal(GRNQTY, value);
    }

    /**
     * Gets the attribute value for Rate, using the alias name Rate.
     * @return the value of Rate
     */
    public BigDecimal getRate() {
        return (BigDecimal) getAttributeInternal(RATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Rate.
     * @param value value to set the Rate
     */
    public void setRate(BigDecimal value) {
        setAttributeInternal(RATE, value);
    }

    /**
     * Gets the attribute value for RateFc, using the alias name RateFc.
     * @return the value of RateFc
     */
    public BigDecimal getRateFc() {
        return (BigDecimal) getAttributeInternal(RATEFC);
    }

    /**
     * Sets <code>value</code> as the attribute value for RateFc.
     * @param value value to set the RateFc
     */
    public void setRateFc(BigDecimal value) {
        setAttributeInternal(RATEFC, value);
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
     * Gets the attribute value for AmountFc, using the alias name AmountFc.
     * @return the value of AmountFc
     */
    public BigDecimal getAmountFc() {
        return (BigDecimal) getAttributeInternal(AMOUNTFC);
    }

    /**
     * Sets <code>value</code> as the attribute value for AmountFc.
     * @param value value to set the AmountFc
     */
    public void setAmountFc(BigDecimal value) {
        setAttributeInternal(AMOUNTFC, value);
    }

    /**
     * Gets the attribute value for LandedCost, using the alias name LandedCost.
     * @return the value of LandedCost
     */
    public BigDecimal getLandedCost() {
        return (BigDecimal) getAttributeInternal(LANDEDCOST);
    }

    /**
     * Sets <code>value</code> as the attribute value for LandedCost.
     * @param value value to set the LandedCost
     */
    public void setLandedCost(BigDecimal value) {
        setAttributeInternal(LANDEDCOST, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedDate.
     * @param value value to set the CreatedDate
     */
    public void setCreatedDate(Timestamp value) {
        setAttributeInternal(CREATEDDATE, value);
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
     * Sets <code>value</code> as the attribute value for UpdatedDate.
     * @param value value to set the UpdatedDate
     */
    public void setUpdatedDate(Timestamp value) {
        setAttributeInternal(UPDATEDDATE, value);
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
     * @return the associated entity TblInvVoucherMasterImpl.
     */
    public TblInvVoucherMasterImpl getTblInvVoucherMaster() {
        return (TblInvVoucherMasterImpl) getAttributeInternal(TBLINVVOUCHERMASTER);
    }

    /**
     * Sets <code>value</code> as the associated entity TblInvVoucherMasterImpl.
     */
    public void setTblInvVoucherMaster(TblInvVoucherMasterImpl value) {
        setAttributeInternal(TBLINVVOUCHERMASTER, value);
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
        return EntityDefImpl.findDefObject("model.ERP.EO.TblInvVoucherDetail");
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

