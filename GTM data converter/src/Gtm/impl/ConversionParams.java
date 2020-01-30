/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conversion Params</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.ConversionParams#getTaxId <em>Tax Id</em>}</li>
 *   <li>{@link Gtm.ConversionParams#getVATpercentage <em>VA Tpercentage</em>}</li>
 *   <li>{@link Gtm.ConversionParams#getCountry <em>Country</em>}</li>
 *   <li>{@link Gtm.ConversionParams#getLegacyStationMappings <em>Legacy Station Mappings</em>}</li>
 *   <li>{@link Gtm.ConversionParams#getLegacyTargetFares <em>Legacy Target Fares</em>}</li>
 *   <li>{@link Gtm.ConversionParams#getLegacyZoneMappings <em>Legacy Zone Mappings</em>}</li>
 *   <li>{@link Gtm.ConversionParams#getLegacyStationToServiceBrandMappings <em>Legacy Station To Service Brand Mappings</em>}</li>
 *   <li>{@link Gtm.ConversionParams#getEndOfSale <em>End Of Sale</em>}</li>
 *   <li>{@link Gtm.ConversionParams#getStartOfSale <em>Start Of Sale</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getConversionParams()
 * @model
 * @generated
 */
public interface ConversionParams extends EObject {
	/**
	 * Returns the value of the '<em><b>Tax Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Id</em>' attribute.
	 * @see #setTaxId(String)
	 * @see Gtm.GtmPackage#getConversionParams_TaxId()
	 * @model
	 * @generated
	 */
	String getTaxId();

	/**
	 * Sets the value of the '{@link Gtm.ConversionParams#getTaxId <em>Tax Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Id</em>' attribute.
	 * @see #getTaxId()
	 * @generated
	 */
	void setTaxId(String value);

	/**
	 * Returns the value of the '<em><b>VA Tpercentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VA Tpercentage</em>' attribute.
	 * @see #setVATpercentage(float)
	 * @see Gtm.GtmPackage#getConversionParams_VATpercentage()
	 * @model
	 * @generated
	 */
	float getVATpercentage();

	/**
	 * Sets the value of the '{@link Gtm.ConversionParams#getVATpercentage <em>VA Tpercentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VA Tpercentage</em>' attribute.
	 * @see #getVATpercentage()
	 * @generated
	 */
	void setVATpercentage(float value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' reference.
	 * @see #setCountry(Country)
	 * @see Gtm.GtmPackage#getConversionParams_Country()
	 * @model
	 * @generated
	 */
	Country getCountry();

	/**
	 * Sets the value of the '{@link Gtm.ConversionParams#getCountry <em>Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(Country value);

	/**
	 * Returns the value of the '<em><b>Legacy Station Mappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Station Mappings</em>' containment reference.
	 * @see #setLegacyStationMappings(LegacyStationMappings)
	 * @see Gtm.GtmPackage#getConversionParams_LegacyStationMappings()
	 * @model containment="true"
	 * @generated
	 */
	LegacyStationMappings getLegacyStationMappings();

	/**
	 * Sets the value of the '{@link Gtm.ConversionParams#getLegacyStationMappings <em>Legacy Station Mappings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legacy Station Mappings</em>' containment reference.
	 * @see #getLegacyStationMappings()
	 * @generated
	 */
	void setLegacyStationMappings(LegacyStationMappings value);

	/**
	 * Returns the value of the '<em><b>Legacy Target Fares</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Target Fares</em>' containment reference.
	 * @see #setLegacyTargetFares(LegacyTargetFares)
	 * @see Gtm.GtmPackage#getConversionParams_LegacyTargetFares()
	 * @model containment="true"
	 * @generated
	 */
	LegacyTargetFares getLegacyTargetFares();

	/**
	 * Sets the value of the '{@link Gtm.ConversionParams#getLegacyTargetFares <em>Legacy Target Fares</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legacy Target Fares</em>' containment reference.
	 * @see #getLegacyTargetFares()
	 * @generated
	 */
	void setLegacyTargetFares(LegacyTargetFares value);

	/**
	 * Returns the value of the '<em><b>Legacy Zone Mappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Zone Mappings</em>' containment reference.
	 * @see #setLegacyZoneMappings(LegacyZoneMappings)
	 * @see Gtm.GtmPackage#getConversionParams_LegacyZoneMappings()
	 * @model containment="true"
	 * @generated
	 */
	LegacyZoneMappings getLegacyZoneMappings();

	/**
	 * Sets the value of the '{@link Gtm.ConversionParams#getLegacyZoneMappings <em>Legacy Zone Mappings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legacy Zone Mappings</em>' containment reference.
	 * @see #getLegacyZoneMappings()
	 * @generated
	 */
	void setLegacyZoneMappings(LegacyZoneMappings value);

	/**
	 * Returns the value of the '<em><b>Legacy Station To Service Brand Mappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Station To Service Brand Mappings</em>' containment reference.
	 * @see #setLegacyStationToServiceBrandMappings(LegacyStationToServiceConstraintMappings)
	 * @see Gtm.GtmPackage#getConversionParams_LegacyStationToServiceBrandMappings()
	 * @model containment="true"
	 * @generated
	 */
	LegacyStationToServiceConstraintMappings getLegacyStationToServiceBrandMappings();

	/**
	 * Sets the value of the '{@link Gtm.ConversionParams#getLegacyStationToServiceBrandMappings <em>Legacy Station To Service Brand Mappings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legacy Station To Service Brand Mappings</em>' containment reference.
	 * @see #getLegacyStationToServiceBrandMappings()
	 * @generated
	 */
	void setLegacyStationToServiceBrandMappings(LegacyStationToServiceConstraintMappings value);

	/**
	 * Returns the value of the '<em><b>End Of Sale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Of Sale</em>' containment reference.
	 * @see #setEndOfSale(EndOfSale)
	 * @see Gtm.GtmPackage#getConversionParams_EndOfSale()
	 * @model containment="true"
	 * @generated
	 */
	EndOfSale getEndOfSale();

	/**
	 * Sets the value of the '{@link Gtm.ConversionParams#getEndOfSale <em>End Of Sale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Of Sale</em>' containment reference.
	 * @see #getEndOfSale()
	 * @generated
	 */
	void setEndOfSale(EndOfSale value);

	/**
	 * Returns the value of the '<em><b>Start Of Sale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Of Sale</em>' containment reference.
	 * @see #setStartOfSale(EndOfSale)
	 * @see Gtm.GtmPackage#getConversionParams_StartOfSale()
	 * @model containment="true"
	 * @generated
	 */
	EndOfSale getStartOfSale();

	/**
	 * Sets the value of the '{@link Gtm.ConversionParams#getStartOfSale <em>Start Of Sale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Of Sale</em>' containment reference.
	 * @see #getStartOfSale()
	 * @generated
	 */
	void setStartOfSale(EndOfSale value);

} // ConversionParams