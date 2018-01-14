/**
 * 3.4 Spring Bean Scopes - Bean 的作用域
 * 在 Spring 中，Bean 的作用域决定了从 Spring 容器中返回的 Bean 实例的类型。
 * 在 Spring 中，支持以下 5 种类型的作用域：

	singleton — 单例模式，由 IOC 容器返回一个唯一的 bean 实例。
	prototype — 原型模式，被请求时，每次返回一个新的 bean 实例。
	request — 每个 HTTP Request 请求返回一个唯一的 Bean 实例。
	session — 每个 HTTP Session 返回一个唯一的 Bean 实例。
	globalSession — Http Session 全局 Bean 实例
 */
/**
 * @author wshuai
 *
 */
package com.shiyanlou.spring.customer.services;