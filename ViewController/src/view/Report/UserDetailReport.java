package view.Report;

import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;

public class UserDetailReport {
    private RichSelectOneChoice format_type;

    public UserDetailReport() {
    }

    public String get_report() {
        // Add event code here...
        return null;
    }

    public void setFormat_type(RichSelectOneChoice format_type) {
        this.format_type = format_type;
    }

    public RichSelectOneChoice getFormat_type() {
        return format_type;
    }
}
