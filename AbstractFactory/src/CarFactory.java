public interface CarFactory {
    // bu fabrika bir araba yada motor fabrikası üretmeli ve bu alt fabrikalarda bana bir araba yada motor üretecektir
    // bu yüzden void olmamalı
    // bu yüzden motorlar Bir IMotor interfacesi
    // arabalar için bir ICar interfacesi yazılmalı
    // bu interface ICar veya IMotor interfacesini impleten alan bir nesne döner.
    // ICar ve IMotor türleri teke indirgemek için vardır
    // ICar ve IMotor Yazılmas ise BmwCar ,AudiCar, BmwMotorCycle , AudiMotorCycle tek tek yazılması gerekir.
    // bu tek tek yazım alt impelementlere gereksiz metod aktarmis olur.
    //void createMotorFactory();
    //void createCarFactory();
    IMotor createMotorFactory();
    ICar createCarFactory();
}
