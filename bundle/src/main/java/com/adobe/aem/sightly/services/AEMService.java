package com.adobe.aem.sightly.services;

/**
 * A simple service interface
 */
public interface AEMService {
    
    /**
     * @return the name of the underlying JCR repository implementation
     */
    public String getRepositoryName();

}