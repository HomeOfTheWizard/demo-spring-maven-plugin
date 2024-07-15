package com.homeofthewizard;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.springframework.vault.config.EnvironmentVaultConfiguration;
import org.springframework.vault.core.VaultTemplate;

import javax.inject.Inject;

@Mojo(name = "run", defaultPhase = LifecyclePhase.GENERATE_SOURCES)
@SpringBootPlugin(EnvironmentVaultConfiguration.class)
public class VaultMojo extends AbstractMojo {

    private final VaultTemplate vaultTemplate;

    @Inject
    public VaultMojo(VaultTemplate vaultTemplate) {
        this.vaultTemplate = vaultTemplate;
    }

    public void execute() {
        System.out.println("vault injected");
    }

}
