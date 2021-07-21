package com.GS.BlueDart.Models;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;

public class Scans {

    @XmlElement
    ArrayList<ScanDetails> ScanDetail = new ArrayList <> ();

    @XmlElement
    public ArrayList<ScanDetails> getScanDetail() {
        return ScanDetail;
    }

    public void setScanDetail(ArrayList<ScanDetails> scanDetail) {
        ScanDetail = scanDetail;
    }
}
