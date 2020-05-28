package view.VoucherType;

import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.view.rich.render.ClientEvent;
import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.binding.OperationBinding;
import oracle.jbo.RowSetIterator;
import oracle.jbo.Row;

import javax.faces.event.ActionEvent;


public class GLvoucherType {
    public GLvoucherType() {
    }

    public void SaveVtp(ActionEvent actionEvent) {
        // Add event code here...
        DCBindingContainer dcBindings = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
        OperationBinding op = dcBindings.getOperationBinding("CreateInsert");
        op.execute();
        DCIteratorBinding iteratorBinding = (DCIteratorBinding) dcBindings.get("TblGlVoucherMasterTransView1Iterator");
        RowSetIterator rowSetIterator = iteratorBinding.getRowSetIterator();
        Row r = rowSetIterator.getCurrentRow();
        
        String getVtp = (String)actionEvent.getComponent().getAttributes().get("sendVTP");

        
        System.out.println("Sending " + getVtp);
        
        r.setAttribute("Vtp", getVtp);
    }
}
