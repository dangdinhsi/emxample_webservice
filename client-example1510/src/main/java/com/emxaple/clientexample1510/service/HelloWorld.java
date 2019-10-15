/**
 * HelloWorld.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emxaple.clientexample1510.service;

public interface HelloWorld extends java.rmi.Remote {
    public com.emxaple.clientexample1510.service.Employee[] getEmployees() throws java.rmi.RemoteException;
    public com.emxaple.clientexample1510.service.Employee addEmployees(com.emxaple.clientexample1510.service.Employee arg0) throws java.rmi.RemoteException;
    public com.emxaple.clientexample1510.service.Employee findById(long arg0) throws java.rmi.RemoteException;
    public com.emxaple.clientexample1510.service.Employee updateEmployee(com.emxaple.clientexample1510.service.Employee arg0) throws java.rmi.RemoteException;
    public java.lang.String sayHelloWorldFrom(java.lang.String arg0) throws java.rmi.RemoteException;
}
