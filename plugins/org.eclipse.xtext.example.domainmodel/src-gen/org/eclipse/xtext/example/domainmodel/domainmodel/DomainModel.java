/**
 * Copyright (c) 2011, 2019 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.example.domainmodel.domainmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xtype.XImportSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.example.domainmodel.domainmodel.DomainModel#getImportSection <em>Import Section</em>}</li>
 *   <li>{@link org.eclipse.xtext.example.domainmodel.domainmodel.DomainModel#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.example.domainmodel.domainmodel.DomainmodelPackage#getDomainModel()
 * @model
 * @generated
 */
public interface DomainModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Import Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import Section</em>' containment reference.
   * @see #setImportSection(XImportSection)
   * @see org.eclipse.xtext.example.domainmodel.domainmodel.DomainmodelPackage#getDomainModel_ImportSection()
   * @model containment="true"
   * @generated
   */
  XImportSection getImportSection();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.example.domainmodel.domainmodel.DomainModel#getImportSection <em>Import Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import Section</em>' containment reference.
   * @see #getImportSection()
   * @generated
   */
  void setImportSection(XImportSection value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.example.domainmodel.domainmodel.AbstractElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.eclipse.xtext.example.domainmodel.domainmodel.DomainmodelPackage#getDomainModel_Elements()
   * @model containment="true"
   * @generated
   */
  EList<AbstractElement> getElements();

} // DomainModel
