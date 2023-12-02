/**
 * generated by Xtext 2.32.0
 */
package org.xtext.example.cv.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.cv.CvPackage;
import org.xtext.example.cv.Education;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Education</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.cv.impl.EducationImpl#getDegree <em>Degree</em>}</li>
 *   <li>{@link org.xtext.example.cv.impl.EducationImpl#getUniversity <em>University</em>}</li>
 *   <li>{@link org.xtext.example.cv.impl.EducationImpl#getYear <em>Year</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EducationImpl extends MinimalEObjectImpl.Container implements Education
{
  /**
   * The default value of the '{@link #getDegree() <em>Degree</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDegree()
   * @generated
   * @ordered
   */
  protected static final String DEGREE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDegree() <em>Degree</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDegree()
   * @generated
   * @ordered
   */
  protected String degree = DEGREE_EDEFAULT;

  /**
   * The default value of the '{@link #getUniversity() <em>University</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUniversity()
   * @generated
   * @ordered
   */
  protected static final String UNIVERSITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUniversity() <em>University</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUniversity()
   * @generated
   * @ordered
   */
  protected String university = UNIVERSITY_EDEFAULT;

  /**
   * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYear()
   * @generated
   * @ordered
   */
  protected static final int YEAR_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYear()
   * @generated
   * @ordered
   */
  protected int year = YEAR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EducationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CvPackage.Literals.EDUCATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDegree()
  {
    return degree;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDegree(String newDegree)
  {
    String oldDegree = degree;
    degree = newDegree;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CvPackage.EDUCATION__DEGREE, oldDegree, degree));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getUniversity()
  {
    return university;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUniversity(String newUniversity)
  {
    String oldUniversity = university;
    university = newUniversity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CvPackage.EDUCATION__UNIVERSITY, oldUniversity, university));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getYear()
  {
    return year;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setYear(int newYear)
  {
    int oldYear = year;
    year = newYear;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CvPackage.EDUCATION__YEAR, oldYear, year));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CvPackage.EDUCATION__DEGREE:
        return getDegree();
      case CvPackage.EDUCATION__UNIVERSITY:
        return getUniversity();
      case CvPackage.EDUCATION__YEAR:
        return getYear();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CvPackage.EDUCATION__DEGREE:
        setDegree((String)newValue);
        return;
      case CvPackage.EDUCATION__UNIVERSITY:
        setUniversity((String)newValue);
        return;
      case CvPackage.EDUCATION__YEAR:
        setYear((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CvPackage.EDUCATION__DEGREE:
        setDegree(DEGREE_EDEFAULT);
        return;
      case CvPackage.EDUCATION__UNIVERSITY:
        setUniversity(UNIVERSITY_EDEFAULT);
        return;
      case CvPackage.EDUCATION__YEAR:
        setYear(YEAR_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CvPackage.EDUCATION__DEGREE:
        return DEGREE_EDEFAULT == null ? degree != null : !DEGREE_EDEFAULT.equals(degree);
      case CvPackage.EDUCATION__UNIVERSITY:
        return UNIVERSITY_EDEFAULT == null ? university != null : !UNIVERSITY_EDEFAULT.equals(university);
      case CvPackage.EDUCATION__YEAR:
        return year != YEAR_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (degree: ");
    result.append(degree);
    result.append(", university: ");
    result.append(university);
    result.append(", year: ");
    result.append(year);
    result.append(')');
    return result.toString();
  }

} //EducationImpl