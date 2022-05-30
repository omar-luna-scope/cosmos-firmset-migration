/*-
 * *****
 * cop-message-handler
 * -----
 * Copyright (C) 2018 - 2021 Scope Retail Systems Inc.
 * -----
 * This software is owned exclusively by Scope Retail Systems Inc.
 * As such, this software may not be copied, modified, or
 * distributed without express permission from Scope Retail Systems Inc.
 * =====
 */

package com.scoperetail.cosmos.firmset.migration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;

@SpringBootApplication(
		exclude = {LiquibaseAutoConfiguration.class, RepositoryRestMvcAutoConfiguration.class})
public class CosmosFirmsetMigrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CosmosFirmsetMigrationApplication.class, args);
	}
}
