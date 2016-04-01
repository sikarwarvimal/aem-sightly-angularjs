package com.adobe.aem.sightly.services.impl;

import com.adobe.aem.sightly.services.AEMService;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.jcr.api.SlingRepository;

import javax.jcr.Repository;

/**
 * One implementation of the {@link com.adobe.aem.sightly.services.AEMService}. Note that
 * the repository is injected, not retrieved.
 */
@Service
@Component(metatype = false)
public class AEMServiceImpl implements AEMService {
    
    @Reference
    private SlingRepository repository;

    public String getRepositoryName() {
        return repository.getDescriptor(Repository.REP_NAME_DESC);
    }

}
