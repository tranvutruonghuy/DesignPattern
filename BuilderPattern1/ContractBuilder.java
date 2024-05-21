package BuilderPattern1;

public interface ContractBuilder {
    public void buildContractID(String contractID);

    public void buildPropertyID(String propertyID);

    public void buildTenantID(String tenantID);

    public void buildRentAmount(double rentAmount);

    public Contract signContract();

}
