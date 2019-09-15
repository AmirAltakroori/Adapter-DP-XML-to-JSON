import java.io.File;

public class XmlAdapter extends NodeFiles{
    private XmlFiles file;

    public XmlAdapter(XmlFiles file) {
        this.file = file;
    }

    @Override
    public File getJsonFile() {
        File file=new File("Asdas");
        return file;
    }
    }
