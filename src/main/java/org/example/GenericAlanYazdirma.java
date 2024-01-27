package org.example;

public class GenericAlanYazdirma<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public static void main(String[] args) {
        GenericAlanYazdirma<String> strGenericAlanYazdirma = new GenericAlanYazdirma<>();
        strGenericAlanYazdirma.setContent("Generic alanda set edilen string veri");
        System.out.println("Generic alanda oluşturulan string veri: " + strGenericAlanYazdirma.getContent());

        GenericAlanYazdirma<Integer> intGenericAlanYazdirma = new GenericAlanYazdirma<>();
        intGenericAlanYazdirma.setContent(1973);
        System.out.println("Generic alanda oluşturulan integer veri: "+intGenericAlanYazdirma.getContent());

        GenericAlanYazdirma<Boolean> blnGenericAlanYazdirma = new GenericAlanYazdirma<>();
        blnGenericAlanYazdirma.setContent(true);
        System.out.println("Generic alanda oluşturulan Boolean veri: "+ blnGenericAlanYazdirma.getContent());
    }
}
