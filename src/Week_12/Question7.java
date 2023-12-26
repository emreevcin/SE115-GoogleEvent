package Week_12;

/*
    Question: It is common to show the size of a file in bytes; but if the size is greater than 1024 bytes, we use kilobytes (KB); and if the size is greater than 1024 KB, we use megabytes (MB); and if the size is greater than 1024 MB, we use gigabytes (GB).
For example, if the file size is 2KB, it is 2048 bytes. However, the operating system rounds the numbers. If the file size is 2200 bytes, it is still displayed as 2KB.
Create a class that stores the file size in bytes as an integer value and has a method that returns the size as a string, such as “2KB” or “10MB”.
 */

public class Question7 {
    public static void main(String[] args) {
        FileSize file1 = new FileSize(2048);
        System.out.println("File size: " + file1.getSizeAsString());

        FileSize file2 = new FileSize(2200);
        System.out.println("File size: " + file2.getSizeAsString());

        FileSize file3 = new FileSize(1500000);
        System.out.println("File size: " + file3.getSizeAsString());

        FileSize file4 = new FileSize(2500000000L);
        System.out.println("File size: " + file4.getSizeAsString());

        FileSize file5 = new FileSize(3400000000000L);
        System.out.println("File size: " + file5.getSizeAsString());
    }
}

class FileSize {
    private long fileSizeInBytes;

    public FileSize(long fileSizeInBytes) {
        this.fileSizeInBytes = fileSizeInBytes;
    }

    public String getSizeAsString() {
        if (fileSizeInBytes < Math.pow(1024, 1)) {
            return fileSizeInBytes + " bytes";
        } else if (fileSizeInBytes < Math.pow(1024, 2)) {
            double sizeInKB = fileSizeInBytes / Math.pow(1024, 1);
            return String.format("%.2f KB", sizeInKB);
        } else if (fileSizeInBytes < Math.pow(1024, 3)) {
            double sizeInMB = fileSizeInBytes / Math.pow(1024, 2);
            return String.format("%.2f MB", sizeInMB);
        } else if (fileSizeInBytes < Math.pow(1024, 4)) {
            double sizeInGB = fileSizeInBytes / Math.pow(1024, 3);
            return String.format("%.2f GB", sizeInGB);
        } else {
            double sizeInTB = fileSizeInBytes / Math.pow(1024, 4);
            return String.format("%.2f TB", sizeInTB);
        }
    }
}