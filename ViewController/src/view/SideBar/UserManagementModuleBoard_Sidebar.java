package view.SideBar;

import java.io.Serializable;

import javax.faces.event.ActionEvent;

import oracle.adf.controller.TaskFlowId;

public class UserManagementModuleBoard_Sidebar implements Serializable {
    private String taskFlowId =
        "/WEB-INF/TaskFlows/Group/Company/SBU/Modules/User_Management/UserMngmtModuleBoard_TaskFlow.xml#UserMngmtModuleBoard_TaskFlow";

    public UserManagementModuleBoard_Sidebar() {
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }
    public void UserManagementFragmentCall(ActionEvent actionEvent) {
        // Add event code here...
        String action = (String)actionEvent.getComponent().getAttributes().get("link");
        StringBuilder link = new StringBuilder();
        link.append("/WEB-INF/TaskFlows/Group/Company/SBU/Modules/User_Management/");
        link.append(action);
        link.append(".xml#");
        link.append(action);
        setDynamicTaskFlowId(link.toString());
    }
}
