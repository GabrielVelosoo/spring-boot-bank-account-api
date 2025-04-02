package io.github.gabrielvelosoo.bankaccountapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_feature", schema = "public")
public class Feature extends BaseItem {
}
