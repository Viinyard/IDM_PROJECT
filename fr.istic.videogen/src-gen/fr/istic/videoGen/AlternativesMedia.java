/**
 * generated by Xtext 2.15.0
 */
package fr.istic.videoGen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternatives Media</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.istic.videoGen.AlternativesMedia#getId <em>Id</em>}</li>
 *   <li>{@link fr.istic.videoGen.AlternativesMedia#getMedias <em>Medias</em>}</li>
 * </ul>
 *
 * @see fr.istic.videoGen.VideoGenPackage#getAlternativesMedia()
 * @model
 * @generated
 */
public interface AlternativesMedia extends Media
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see fr.istic.videoGen.VideoGenPackage#getAlternativesMedia_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link fr.istic.videoGen.AlternativesMedia#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Medias</b></em>' containment reference list.
   * The list contents are of type {@link fr.istic.videoGen.MediaDescription}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Medias</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Medias</em>' containment reference list.
   * @see fr.istic.videoGen.VideoGenPackage#getAlternativesMedia_Medias()
   * @model containment="true"
   * @generated
   */
  EList<MediaDescription> getMedias();

} // AlternativesMedia
