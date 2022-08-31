package edu.lernia.labb3;

public class Patient {

    private String name;
    private String sickness;

    Patient(String name) {
        this.name = name;
    }

    Patient(String name, String sickness) {
        this.name = name;
        this.sickness = sickness;
    }

    protected String getName() {
        return this.name;
    }

    protected String getSickness() {
        return this.sickness;
    }

    protected boolean isSick() {

        if (this.sickness != null) {
            return true;
        } else {
            return false;
        }

    }

    protected void takeMedication(Medicine medicine) {

        if (medicine.getTreatmentName() == this.sickness) {
            this.sickness = null;
        }

    }
}
