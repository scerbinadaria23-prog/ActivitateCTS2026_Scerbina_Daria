package ro.ase.cts.lazy;

public class ServiceAuto implements IService{
    private String numeService;
    private AMasina masinaDinService;

    private static ServiceAuto instanta = null;

    private ServiceAuto(String numeService) {
        this.numeService = numeService;
        this.masinaDinService = null;
    }

    public static synchronized ServiceAuto getInstance(String numeService){
        if(instanta == null){
            instanta = new ServiceAuto(numeService);
        }
        return instanta;
    }

    @Override
    public void intrareService(AMasina masina) {
        if(masinaDinService == null){
            masinaDinService = masina;
            System.out.println("Masina a intrat in service: ");
            masina.descriere();
        } else {
            System.out.println("Service ocupat!");
        }

    }

    @Override
    public void iesireService() {
        if(masinaDinService != null){
            System.out.println("Masina a iesit din service: ");
            masinaDinService.descriere();
            masinaDinService = null;
        } else {
            System.out.println("Nu exista masina in service.");
        }


    }
}
