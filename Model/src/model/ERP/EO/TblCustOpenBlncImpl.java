package model.ERP.EO;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.Key;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jun 24 11:12:21 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblCustOpenBlncImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        CustOpenBlncId,
        CustOpenBlncDated,
        PblCustId,
        CustOpenBlncDr,
        CustOpenBlncCr,
        GroupCompanyId,
        CompanySbuId,
        TblPblCust;
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
    public static final int CUSTOPENBLNCID = AttributesEnum.CustOpenBlncId.index();
    public static final int CUSTOPENBLNCDATED = AttributesEnum.CustOpenBlncDated.index();
    public static final int PBLCUSTID = AttributesEnum.PblCustId.index();
    public static final int CUSTOPENBLNCDR = AttributesEnum.CustOpenBlncDr.index();
    public static final int CUSTOPENBLNCCR = AttributesEnum.CustOpenBlncCr.index();
    public static final int GROUPCOMPANYID = AttributesEnum.GroupCompanyId.index();
    public static final int COMPANYSBUID = AttributesEnum.CompanySbuId.index();
    public static final int TBLPBLCUST = AttributesEnum.TblPblCust.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblCustOpenBlncImpl() {
    }

    /**
     * Gets the attribute value for CustOpenBlncId, using the alias name CustOpenBlncId.
     * @return the value of CustOpenBlncId
     */
    public BigDecimal getCustOpenBlncId() {
        return (BigDecimal) getAttributeInternal(CUSTOPENBLNCID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CustOpenBlncId.
     * @param value value to set the CustOpenBlncId
     */
    public void setCustOpenBlncId(BigDecimal value) {
        setAttributeInternal(CUSTOPENBLNCID, value);
    }

    /**
     * Gets the attribute value for CustOpenBlncDated, using the alias name CustOpenBlncDated.
     * @return the value of CustOpenBlncDated
     */
    public Timestamp getCustOpenBlncDated() {
        return (Timestamp) getAttributeInternal(CUSTOPENBLNCDATED);
    }

    /**
     * Sets <code>value</code> as the attribute value for CustOpenBlncDated.
     * @param value value to set the CustOpenBlncDated
     */
    public void setCustOpenBlncDated(Timestamp value) {
        setAttributeInternal(CUSTOPENBLNCDATED, value);
    }

    /**
     * Gets the attribute value for PblCustId, using the alias name PblCustId.
     * @return the value of PblCustId
     */
    public BigDecimal getPblCustId() {
        return (BigDecimal) getAttributeInternal(PBLCUSTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for PblCustId.
     * @param value value to set the PblCustId
     */
    public void setPblCustId(BigDecimal value) {
        setAttributeInternal(PBLCUSTID, value);
    }

    /**
     * Gets the attribute value for CustOpenBlncDr, using the alias name CustOpenBlncDr.
     * @return the value of CustOpenBlncDr
     */
    public BigDecimal getCustOpenBlncDr() {
        return (BigDecimal) getAttributeInternal(CUSTOPENBLNCDR);
    }

    /**
     * Sets <code>value</code> as the attribute value for CustOpenBlncDr.
     * @param value value to set the CustOpenBlncDr
     */
    public void setCustOpenBlncDr(BigDecimal value) {
        setAttributeInternal(CUSTOPENBLNCDR, value);
    }

    /**
     * Gets the attribute value for CustOpenBlncCr, using the alias name CustOpenBlncCr.
     * @return the value of CustOpenBlncCr
     */
    public BigDecimal getCustOpenBlncCr() {
        return (BigDecimal) getAttributeInternal(CUSTOPENBLNCCR);
    }

    /**
     * Sets <code>value</code> as the attribute value for CustOpenBlncCr.
     * @param value value to set the CustOpenBlncCr
     */
    public void setCustOpenBlncCr(BigDecimal value) {
        setAttributeInternal(CUSTOPENBLNCCR, value);
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
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getTblPblCust() {
        return (EntityImpl) getAttributeInternal(TBLPBLCUST);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblPblCust(EntityImpl value) {
        setAttributeInternal(TBLPBLCUST, value);
    }

    /**
     * @param custOpenBlncId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal custOpenBlncId) {
        return new Key(new Object[] { custOpenBlncId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.ERP.EO.TblCustOpenBlnc");
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
        super.doDML(operation, e);
    }
}

