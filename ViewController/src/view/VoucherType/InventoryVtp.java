package view.VoucherType;

import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;

import oracle.binding.OperationBinding;

import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;

public class InventoryVtp {
    public InventoryVtp() {
    }

    public void SaveVTP(ActionEvent actionEvent) {
        // Add event code here...
        DCBindingContainer dcBindings = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
        OperationBinding op = dcBindings.getOperationBinding("CreateInsert");
        op.execute();
        DCIteratorBinding iteratorBinding = (DCIteratorBinding) dcBindings.get("TblInvVoucherMasterTransView1Iterator");
        RowSetIterator rowSetIterator = iteratorBinding.getRowSetIterator();
        Row r = rowSetIterator.getCurrentRow();
        
        String getVtp = (String)actionEvent.getComponent().getAttributes().get("sendVTP");

        
        System.out.println("Sending " + getVtp);
        
        r.setAttribute("Vtp", getVtp);
    }
}
