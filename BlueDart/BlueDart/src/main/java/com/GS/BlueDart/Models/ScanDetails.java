package com.GS.BlueDart.Models;

import javax.xml.bind.annotation.XmlElement;

public class ScanDetails {
    @XmlElement
    private String Scan;

    @XmlElement
    private String ScanCode;

    @XmlElement
    private String ScanType;

    @XmlElement
    private String ScanGroupType;

    @XmlElement
    private String ScanDate;

    @XmlElement
    private String ScanTime;

    @XmlElement
    private String ScannedLocation;

    @XmlElement
    private String ScannedLocationCode;

    public String getScan() {
        return Scan;
    }

    public void setScan(String scan) {
        Scan = scan;
    }

    public String getScanCode() {
        return ScanCode;
    }

    public void setScanCode(String scanCode) {
        ScanCode = scanCode;
    }

    public String getScanType() {
        return ScanType;
    }

    public void setScanType(String scanType) {
        ScanType = scanType;
    }

    public String getScanGroupType() {
        return ScanGroupType;
    }

    public void setScanGroupType(String scanGroupType) {
        ScanGroupType = scanGroupType;
    }

    public String getScanDate() {
        return ScanDate;
    }

    public void setScanDate(String scanDate) {
        ScanDate = scanDate;
    }

    public String getScanTime() {
        return ScanTime;
    }

    public void setScanTime(String scanTime) {
        ScanTime = scanTime;
    }

    public String getScannedLocation() {
        return ScannedLocation;
    }

    public void setScannedLocation(String scannedLocation) {
        ScannedLocation = scannedLocation;
    }

    public String getScannedLocationCode() {
        return ScannedLocationCode;
    }

    public void setScannedLocationCode(String scannedLocationCode) {
        ScannedLocationCode = scannedLocationCode;
    }
}
