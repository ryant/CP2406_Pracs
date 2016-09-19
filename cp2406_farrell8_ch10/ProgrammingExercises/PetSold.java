/**
 * Created by Ryman on 19-Sep-16.
 */
public class PetSold extends ItemSold {
    private boolean isVaccinated;
    private boolean isNeutered;
    private boolean isHousebroken;

    public void setIsVaccinated(boolean isVaccinated) {
        this.isVaccinated = isVaccinated;
    }

    public void setIsNeutered(boolean isNeutered) {
        this.isNeutered = isNeutered;
    }

    public void setIsHousebroken(boolean isHousebroken) {
        this.isHousebroken = isHousebroken;
    }

    public boolean getIsVaccinated() {
        return isVaccinated;
    }

    public boolean getIsNeutered() {
        return isNeutered;
    }

    public boolean getIsHousebroken() {
        return isHousebroken;
    }
}
