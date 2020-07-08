package view.Image;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import java.util.Random;

import javax.faces.event.ActionEvent;

import javax.faces.event.ValueChangeEvent;

import oracle.adf.view.rich.component.rich.input.RichInputText;

import org.apache.myfaces.trinidad.model.UploadedFile;

public class FileManaging {
    public FileManaging() {
    }

    private UploadedFile file;
    private static String UniFileName;
    private RichInputText db_Image_Value;


    public void UploadImage(ActionEvent actionEvent) {
        // Add event code here...
        
        UploadedFile myfile = this.getFile();
        
        System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo    "+myfile);
        
        String path = null;
        path = (String) actionEvent.getComponent().getAttributes().get("path");
        

        if (myfile == null) {
            System.out.println("got no file");
        } else {
            // All uploaded files will be stored in below path
            UniFileName = (getRandomInteger(100000, 1000000)) + myfile.getFilename();
            path = path + UniFileName;

            db_Image_Value.setValue(UniFileName);
            
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
        int ii = r.nextInt(100000 - 50000) + 50000;
        String genNumber = Integer.toString(ii);
        System.out.println(genNumber);

        return genNumber;
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
}
