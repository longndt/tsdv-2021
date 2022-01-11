package com.example.web.controller;

import com.example.web.model.*;
import com.example.web.model.Product;
import com.example.web.repository.CategoryRepository;
import com.example.web.repository.ProductDetailRepository;
import com.example.web.repository.ProductRepository;
import com.example.web.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductDetailRepository productDetailRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    ShopRepository shopRepository;

    @RequestMapping("")
    public String getProductList(Model model) {
        List<Product> products = productRepository.findAll();
        List<ProductDetail> productDetails = productDetailRepository.findAll();
        List<Shop> shops = shopRepository.findAll();
        model.addAttribute("products", products);
        model.addAttribute("productDetails", productDetails);
        model.addAttribute("shops", shops);
        return "productList";
    }

    @RequestMapping("/{id}")
    public String getProductById(Model model,
                             @PathVariable(value = "id") Long id) {
        Product product = productRepository.getById(id);
        ProductDetail productDetail = productDetailRepository.getById(id);
        List<Shop> shops = shopRepository.findAll();
        model.addAttribute("product", product);
        model.addAttribute("productDetail", productDetail);
        model.addAttribute("shops", shops);
        return "productDetail";
    }

    @RequestMapping("/add")
    public String addProduct (Model model) {
        Product product = new Product();
        ProductDetail productDetail = new ProductDetail();
        List<Category> categories = categoryRepository.findAll();
        List<Shop> shops = shopRepository.findAll();
        model.addAttribute("product", product);
        model.addAttribute("productDetail", productDetail);
        model.addAttribute("categories", categories);
        model.addAttribute("shops", shops);
        return "productAdd";
    }

    @RequestMapping("/update/{id}")
    public String updateProduct(
            @PathVariable (value = "id") Long id, Model model)  {
        Product product = productRepository.getById(id);
        ProductDetail productDetail = productDetailRepository.getById(id);
        List<Category> categories = categoryRepository.findAll();
        List<Shop> shops = shopRepository.findAll();
        model.addAttribute("product", product);
        model.addAttribute("productDetail", productDetail);
        model.addAttribute("categories", categories);
        model.addAttribute("shops", shops);
        return "productUpdate";
    }

    @RequestMapping("/save")
    public String saveUpdate (
            Product product,
            ProductDetail productDetail,
            @RequestParam(value = "id", required = false) Long id)
    {
        product.setId(id);
        productDetail.setId(id);
        productRepository.save(product);
        productDetailRepository.save(productDetail);
        return "redirect:/product";
    }

    @RequestMapping("/delete/{id}")
    public String deleteProduct(
            @PathVariable(value = "id") Long id) {
        Product product = productRepository.getById(id);
        productRepository.delete(product);
        return "redirect:/product";
    }

    @RequestMapping("/search")
    public String searchProduct(
            Model model,
            @RequestParam(value = "name") String name) {
        List<Product> products  = productRepository.findByNameContaining(name);
        model.addAttribute("products", products);
        return "productList";
    }
}
