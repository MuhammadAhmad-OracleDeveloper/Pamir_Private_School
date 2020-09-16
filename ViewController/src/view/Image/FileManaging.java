package view.Image;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import java.io.OutputStream;

import java.util.Random;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import javax.faces.event.ValueChangeEvent;

import javax.servlet.http.HttpServletResponse;

import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.component.rich.input.RichInputText;

import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;

import oracle.adf.view.rich.component.rich.nav.RichLink;

import oracle.binding.AttributeBinding;
import oracle.binding.BindingContainer;

import org.apache.myfaces.trinidad.model.UploadedFile;

public class FileManaging {


    private RichInputText db_passport_image_value;
    private RichLink db_docs_image_download_path;
    private RichInputText db_docs_image_value;
    private RichInputText db_study_material_image_value;
    private RichLink db_study_material_image_download_path;

    public FileManaging() {
    }

    private UploadedFile file;
    private static String UniFileName;
    private RichInputText db_Image_Value;
    private RichInputText db_visa_image_value;
    private RichLink db_visa_image_download_path;
    private RichLink db_passport_image_download_path;


    public void UploadImage(ActionEvent actionEvent) {
        // Add event code here...
        UploadedFile myfile = this.getFile();
        
        System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo    "+myfile);
        
        String path = null;
        path = (String) actionEvent.getComponent().getAttributes().get("path");
        String actPerform = (String) actionEvent.getComponent().getAttributes().get("actionPerform");

        if (myfile == null) {
            System.out.println("got no file");
        } else {
            // All uploaded files will be stored in below path
            UniFileName = (getRandomInteger(100000, 1000000)) + myfile.getFilename();
            path = path + UniFileName;

            switch (actPerform){
            case "db_Image_Value":
                db_Image_Value.setValue(UniFileName);
                break;
            case "db_visa_image_value":
                db_visa_image_value.setValue(UniFileName);
                break;
            case "db_passport_image_value":
                db_passport_image_value.setValue(UniFileName);
                break;
            case "db_docs_image_value":
                db_docs_image_value.setValue(UniFileName);
                break;
            case "db_study_material_image_value":
                db_study_material_image_value.setValue(UniFileName);
                break;
            default:
                System.out.println("nothing to upload");
            }
//            db_Image_Value.setValue(UniFileName);
            
            InputStream inputStream = null;
            try {
                FileOutputStream out = new FileOutputStream(path);
                inputStream = myfile.getInputStream();
                byte[] buffer = new byte[8192];
                int bytesRead = 0;
                while ((bytesRead = inputStream.read(buffer, 0, 8192)) != -1) {
                    out.write(buffer, 0, bytesRead);
                }
                out.flush();
                out.close();
            } catch (Exception ex) {
                // handle exception
                ex.printStackTrace();
            } finally {
                try {
                    inputStream.close();
                } catch (IOException e) {
                }
            }
        }
    }
    
    public static String getRandomInteger(int min, int max) {
        Random r = new Random();
        int ii = r.nextInt(100000000 - 50000000) + 50000000;
        String genNumber = Integer.toString(ii);
        System.out.println(genNumber);

        return genNumber;
    }
    public void downloadmeVisa(FacesContext fc, OutputStream os) throws IOException
    {
        String FilePath = (String)this.getDb_visa_image_download_path().getIcon();
        String FileName = (String)this.getDb_visa_image_download_path().getText();
        
        
        File file = new File(FilePath + FileName);
        
        FacesContext facesContext = FacesContext.getCurrentInstance();

        HttpServletResponse response = 
                (HttpServletResponse) facesContext.getExternalContext().getResponse();

        response.reset();
        response.setHeader("Content-Type", "application/octet-stream");
        response.setHeader("Content-Disposition", "attachment;filename="+FileName);

        OutputStream responseOutputStream = response.getOutputStream();

        InputStream fileInputStream = new FileInputStream(file);

        byte[] bytesBuffer = new byte[2048];
        int bytesRead;
        while ((bytesRead = fileInputStream.read(bytesBuffer)) > 0) 
        {
            responseOutputStream.write(bytesBuffer, 0, bytesRead);
        }

        responseOutputStream.flush();

        fileInputStream.close();
        responseOutputStream.close();

        facesContext.responseComplete();

    }
    
    
    
    public void downloadmePass(FacesContext fc, OutputStream os) throws IOException
    {
        String FilePath = (String)this.getDb_passport_image_download_path().getIcon();
        String FileName = (String)this.getDb_passport_image_download_path().getText();
        
        
        File file = new File(FilePath + FileName);
        
        FacesContext facesContext = FacesContext.getCurrentInstance();

        HttpServletResponse response = 
                (HttpServletResponse) facesContext.getExternalContext().getResponse();

        response.reset();
        response.setHeader("Content-Type", "application/octet-stream");
        response.setHeader("Content-Disposition", "attachment;filename="+FileName);

        OutputStream responseOutputStream = response.getOutputStream();

        InputStream fileInputStream = new FileInputStream(file);

        byte[] bytesBuffer = new byte[2048];
        int bytesRead;
        while ((bytesRead = fileInputStream.read(bytesBuffer)) > 0) 
        {
            responseOutputStream.write(bytesBuffer, 0, bytesRead);
        }

        responseOutputStream.flush();

        fileInputStream.close();
        responseOutputStream.close();

        facesContext.responseComplete();

    }


    public void downloadmeDocs(FacesContext fc, OutputStream os) throws IOException
    {
        String FilePath = (String)this.getDb_docs_image_download_path().getIcon();
        String FileName = (String)this.getDb_docs_image_download_path().getText();
        
        
        File file = new File(FilePath + FileName);
        
        FacesContext facesContext = FacesContext.getCurrentInstance();

        HttpServletResponse response = 
                (HttpServletResponse) facesContext.getExternalContext().getResponse();

        response.reset();
        response.setHeader("Content-Type", "application/octet-stream");
        response.setHeader("Content-Disposition", "attachment;filename="+FileName);

        OutputStream responseOutputStream = response.getOutputStream();

        InputStream fileInputStream = new FileInputStream(file);

        byte[] bytesBuffer = new byte[2048];
        int bytesRead;
        while ((bytesRead = fileInputStream.read(bytesBuffer)) > 0) 
        {
            responseOutputStream.write(bytesBuffer, 0, bytesRead);
        }

        responseOutputStream.flush();

        fileInputStream.close();
        responseOutputStream.close();

        facesContext.responseComplete();

    }



    public void downloadmeStdStudyMaterial(FacesContext fc, OutputStream os) throws IOException
    {                                   
        String FilePath = (String)this.getDb_study_material_image_download_path().getIcon();
        String FileName = (String)this.getDb_study_material_image_download_path().getText();
        
        
        File file = new File(FilePath + FileName);
        
        FacesContext facesContext = FacesContext.getCurrentInstance();

        HttpServletResponse response = 
                (HttpServletResponse) facesContext.getExternalContext().getResponse();

        response.reset();
        response.setHeader("Content-Type", "application/octet-stream");
        response.setHeader("Content-Disposition", "attachment;filename="+FileName);

        OutputStream responseOutputStream = response.getOutputStream();

        InputStream fileInputStream = new FileInputStream(file);

        byte[] bytesBuffer = new byte[2048];
        int bytesRead;
        while ((bytesRead = fileInputStream.read(bytesBuffer)) > 0) 
        {
            responseOutputStream.write(bytesBuffer, 0, bytesRead);
        }

        responseOutputStream.flush();

        fileInputStream.close();
        responseOutputStream.close();

        facesContext.responseComplete();

    }


    public RichLink getDb_study_material_image_download_path() {
        return db_study_material_image_download_path;
    }

      public void setDb_Image_Value(RichInputText db_Image_Value) {
        this.db_Image_Value = db_Image_Value;
    }

    public RichInputText getDb_Image_Value() {
        return db_Image_Value;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }

    public UploadedFile getFile() {
        return file;
    }
    


    public void setDb_visa_image_value(RichInputText db_visa_image_value) {
        this.db_visa_image_value = db_visa_image_value;
    }

    public RichInputText getDb_visa_image_value() {
        return db_visa_image_value;
    }

    public void setDb_visa_image_download_path(RichLink db_visa_image_download_path) {
        this.db_visa_image_download_path = db_visa_image_download_path;
    }

    public RichLink getDb_visa_image_download_path() {
        return db_visa_image_download_path;
    }

    public void setDb_passport_image_download_path(RichLink db_passport_image_download_path) {
        this.db_passport_image_download_path = db_passport_image_download_path;
    }

    public RichLink getDb_passport_image_download_path() {
        return db_passport_image_download_path;
    }

    public void setDb_passport_image_value(RichInputText db_passport_image_value) {
        this.db_passport_image_value = db_passport_image_value;
    }

    public RichInputText getDb_passport_image_value() {
        return db_passport_image_value;
    }

    public void setDb_docs_image_download_path(RichLink db_docs_image_download_path) {
        this.db_docs_image_download_path = db_docs_image_download_path;
    }

    public RichLink getDb_docs_image_download_path() {
        return db_docs_image_download_path;
    }

    public void setDb_docs_image_value(RichInputText db_docs_image_value) {
        this.db_docs_image_value = db_docs_image_value;
    }

    public RichInputText getDb_docs_image_value() {
        return db_docs_image_value;
    }

    public void setDb_study_material_image_value(RichInputText db_study_material_image_value) {
        this.db_study_material_image_value = db_study_material_image_value;
    }

    public RichInputText getDb_study_material_image_value() {
        return db_study_material_image_value;
    }

    public void setDb_study_material_image_download_path(RichLink db_study_material_image_download_path) {
        this.db_study_material_image_download_path = db_study_material_image_download_path;
    }
}
