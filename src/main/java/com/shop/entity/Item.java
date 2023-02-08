package com.shop.entity;

import com.shop.constant.ItemSellStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "item")
@Getter
@Setter
@ToString
public class Item {

    @Id
    @Column(name="item_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;                        // 상품 코드
    @Column(nullable = false, length = 50)
    private String itemNn;                  // 상품명
    private int price;                      // 가격
    private int stockNumber;                // 재고수량
    private String itemDetail;              // 상품 상세 설명
    private ItemSellStatus itemSellStatus;  // 상품 판매 상태
    private LocalDateTime regTime;          // 등록 시간
    private LocalDateTime updateTime;       // 수정 시간
}
