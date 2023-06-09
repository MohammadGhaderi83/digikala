package org.example.NonElectronicTools;

public class Hammer extends NonElectronicTools{
    private String crossSectionalSize;

    public Hammer(String name, String brand, double price, int number, String color, String ID, String companyName, String material, double weight, String crossSectionalSize) {
        super(name, brand, price, number, color, ID, companyName, material, weight);
        this.crossSectionalSize = crossSectionalSize;
    }

    public String getCrossSectionalSize() {
        return crossSectionalSize;
    }

    public void setCrossSectionalSize(String crossSectionalSize) {
        this.crossSectionalSize = crossSectionalSize;
    }

    @Override
    public String toString() {
        return super.toString() + "->" + "Hammer{" +
                "crossSectionalSize='" + crossSectionalSize + '\'' +
                "}\n";
    }
}
