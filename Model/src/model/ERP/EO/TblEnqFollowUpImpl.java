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
// ---    Wed Mar 18 22:44:39 PDT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblEnqFollowUpImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Id,
        GroupCompanyId,
        Dated,
        FollowMethod,
        StdEnqId,
        SmsToType,
        SmsContactNo,
        SmsText,
        EmailToType,
        EmailTo,
        EmailSubject,
        EmailBody,
        CallToType,
        CallContactNo,
        CallContent,
        Ast,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        TblStdEnq;
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
    public static final int FOLLOWMETHOD = AttributesEnum.FollowMethod.index();
    public static final int STDENQID = AttributesEnum.StdEnqId.index();
    public static final int SMSTOTYPE = AttributesEnum.SmsToType.index();
    public static final int SMSCONTACTNO = AttributesEnum.SmsContactNo.index();
    public static final int SMSTEXT = AttributesEnum.SmsText.index();
    public static final int EMAILTOTYPE = AttributesEnum.EmailToType.index();
    public static final int EMAILTO = AttributesEnum.EmailTo.index();
    public static final int EMAILSUBJECT = AttributesEnum.EmailSubject.index();
    public static final int EMAILBODY = AttributesEnum.EmailBody.index();
    public static final int CALLTOTYPE = AttributesEnum.CallToType.index();
    public static final int CALLCONTACTNO = AttributesEnum.CallContactNo.index();
    public static final int CALLCONTENT = AttributesEnum.CallContent.index();
    public static final int AST = AttributesEnum.Ast.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int TBLSTDENQ = AttributesEnum.TblStdEnq.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblEnqFollowUpImpl() {
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
     * Gets the attribute value for FollowMethod, using the alias name FollowMethod.
     * @return the value of FollowMethod
     */
    public String getFollowMethod() {
        return (String) getAttributeInternal(FOLLOWMETHOD);
    }

    /**
     * Sets <code>value</code> as the attribute value for FollowMethod.
     * @param value value to set the FollowMethod
     */
    public void setFollowMethod(String value) {
        setAttributeInternal(FOLLOWMETHOD, value);
    }

    /**
     * Gets the attribute value for StdEnqId, using the alias name StdEnqId.
     * @return the value of StdEnqId
     */
    public BigDecimal getStdEnqId() {
        return (BigDecimal) getAttributeInternal(STDENQID);
    }

    /**
     * Sets <code>value</code> as the attribute value for StdEnqId.
     * @param value value to set the StdEnqId
     */
    public void setStdEnqId(BigDecimal value) {
        setAttributeInternal(STDENQID, value);
    }

    /**
     * Gets the attribute value for SmsToType, using the alias name SmsToType.
     * @return the value of SmsToType
     */
    public String getSmsToType() {
        return (String) getAttributeInternal(SMSTOTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for SmsToType.
     * @param value value to set the SmsToType
     */
    public void setSmsToType(String value) {
        setAttributeInternal(SMSTOTYPE, value);
    }

    /**
     * Gets the attribute value for SmsContactNo, using the alias name SmsContactNo.
     * @return the value of SmsContactNo
     */
    public String getSmsContactNo() {
        return (String) getAttributeInternal(SMSCONTACTNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for SmsContactNo.
     * @param value value to set the SmsContactNo
     */
    public void setSmsContactNo(String value) {
        setAttributeInternal(SMSCONTACTNO, value);
    }

    /**
     * Gets the attribute value for SmsText, using the alias name SmsText.
     * @return the value of SmsText
     */
    public String getSmsText() {
        return (String) getAttributeInternal(SMSTEXT);
    }

    /**
     * Sets <code>value</code> as the attribute value for SmsText.
     * @param value value to set the SmsText
     */
    public void setSmsText(String value) {
        setAttributeInternal(SMSTEXT, value);
    }

    /**
     * Gets the attribute value for EmailToType, using the alias name EmailToType.
     * @return the value of EmailToType
     */
    public String getEmailToType() {
        return (String) getAttributeInternal(EMAILTOTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for EmailToType.
     * @param value value to set the EmailToType
     */
    public void setEmailToType(String value) {
        setAttributeInternal(EMAILTOTYPE, value);
    }

    /**
     * Gets the attribute value for EmailTo, using the alias name EmailTo.
     * @return the value of EmailTo
     */
    public String getEmailTo() {
        return (String) getAttributeInternal(EMAILTO);
    }

    /**
     * Sets <code>value</code> as the attribute value for EmailTo.
     * @param value value to set the EmailTo
     */
    public void setEmailTo(String value) {
        setAttributeInternal(EMAILTO, value);
    }

    /**
     * Gets the attribute value for EmailSubject, using the alias name EmailSubject.
     * @return the value of EmailSubject
     */
    public String getEmailSubject() {
        return (String) getAttributeInternal(EMAILSUBJECT);
    }

    /**
     * Sets <code>value</code> as the attribute value for EmailSubject.
     * @param value value to set the EmailSubject
     */
    public void setEmailSubject(String value) {
        setAttributeInternal(EMAILSUBJECT, value);
    }

    /**
     * Gets the attribute value for EmailBody, using the alias name EmailBody.
     * @return the value of EmailBody
     */
    public String getEmailBody() {
        return (String) getAttributeInternal(EMAILBODY);
    }

    /**
     * Sets <code>value</code> as the attribute value for EmailBody.
     * @param value value to set the EmailBody
     */
    public void setEmailBody(String value) {
        setAttributeInternal(EMAILBODY, value);
    }

    /**
     * Gets the attribute value for CallToType, using the alias name CallToType.
     * @return the value of CallToType
     */
    public String getCallToType() {
        return (String) getAttributeInternal(CALLTOTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CallToType.
     * @param value value to set the CallToType
     */
    public void setCallToType(String value) {
        setAttributeInternal(CALLTOTYPE, value);
    }

    /**
     * Gets the attribute value for CallContactNo, using the alias name CallContactNo.
     * @return the value of CallContactNo
     */
    public String getCallContactNo() {
        return (String) getAttributeInternal(CALLCONTACTNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for CallContactNo.
     * @param value value to set the CallContactNo
     */
    public void setCallContactNo(String value) {
        setAttributeInternal(CALLCONTACTNO, value);
    }

    /**
     * Gets the attribute value for CallContent, using the alias name CallContent.
     * @return the value of CallContent
     */
    public String getCallContent() {
        return (String) getAttributeInternal(CALLCONTENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for CallContent.
     * @param value value to set the CallContent
     */
    public void setCallContent(String value) {
        setAttributeInternal(CALLCONTENT, value);
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
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getTblStdEnq() {
        return (EntityImpl) getAttributeInternal(TBLSTDENQ);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblStdEnq(EntityImpl value) {
        setAttributeInternal(TBLSTDENQ, value);
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
        return EntityDefImpl.findDefObject("model.ERP.EO.TblEnqFollowUp");
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

