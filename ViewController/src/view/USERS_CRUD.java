package view;

import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class USERS_CRUD {
    public USERS_CRUD() {
    }

    public oracle.binding.BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }
    
    public void get_users_crud_bind(ActionEvent actionEvent) {
        // Add event code here...
        System.out.println("users crud get_users_crud_bind called");
        String AcLslinkAC = (String) actionEvent.getComponent().getAttributes().get("AcLslink");
        System.out.println(AcLslinkAC);
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding(AcLslinkAC);
        Object result = operationBinding.execute();
    }
}
