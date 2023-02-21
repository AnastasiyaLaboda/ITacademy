package Task1;

public class PrimitiveTypeExperiment {
    public byte byteMinValue = Byte.MIN_VALUE;
    public byte byteMaxValue = Byte.MAX_VALUE;
    public short shortMinValue = Short.MIN_VALUE;
    public short shortMaxValue = Short.MAX_VALUE;
    public int intMinValue = Integer.MIN_VALUE;
    public int intMaxValue = Integer.MAX_VALUE;
    public long longMinValue = Long.MIN_VALUE;
    public long longMaxValue = Long.MAX_VALUE;


    public static void main(String[] args) {
        PrimitiveTypeExperiment experiment = new PrimitiveTypeExperiment();
        experiment.printAllMaxValues();
        experiment.printAllMinValues();
        experiment.decrementAllMin();
        experiment.incrementAllMax();
        experiment.printAllMaxValues();
        experiment.printAllMinValues();
    }

    public void printAllMaxValues() {
        System.out.println(byteMaxValue);
        System.out.println(shortMaxValue);
        System.out.println(intMaxValue);
        System.out.println(longMaxValue);
        System.out.println();
    }

    public void printAllMinValues() {
        System.out.println(byteMinValue);
        System.out.println(shortMinValue);
        System.out.println(intMinValue);
        System.out.println(longMinValue);
        System.out.println();
    }

    public void decrementAllMin() {
        byteMinValue--;
        shortMinValue--;
        intMinValue--;
        longMinValue--;
    }

    public void incrementAllMax() {
        byteMaxValue++;
        shortMaxValue++;
        intMaxValue++;
        longMaxValue++;
    }

}
