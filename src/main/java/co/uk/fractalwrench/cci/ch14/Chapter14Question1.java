package co.uk.fractalwrench.cci.ch14;

public class Chapter14Question1 {

    /*
     * Question: write a SQL query to get a list of tenant names who rent more than one apartment
     *
     * One Building has many Apartments.
     * Many Apartments have Many Tenants (represented by a TenantApartment table).
     *
     * General approach: the TenantApartment table holds the tenant ID. If there are multiple rows containing the same
     * tenant ID, then that tenant must be renting multiple apartments. Therefore, the SQL query needs to remove any
     * IDs which only show once, then find the name.
     *
     * SELECT TenantName
     * FROM Tenants
     * INNER JOIN
     *     (SELECT TenantID FROM AptTenants GROUPBY TenantID Having COUNT(*) > 1) C
     * ON Tenants.TenantID = C.TenantID
     */

}
