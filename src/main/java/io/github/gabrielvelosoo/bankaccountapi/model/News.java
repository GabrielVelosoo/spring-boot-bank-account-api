package io.github.gabrielvelosoo.bankaccountapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_news", schema = "public")
public class News extends BaseItem {
}
