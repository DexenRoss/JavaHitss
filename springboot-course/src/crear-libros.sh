#!/usr/bin/env bash

API_URL="http://localhost:8080/api/books"

books=(
  "9780000000001|Java Fundamentals|Ana Torres"
  "9780000000002|Advanced Java Programming|Carlos Mendoza"
  "9780000000003|Spring Boot desde Cero|Laura Hernández"
  "9780000000004|Spring Security en Acción|Miguel Ramírez"
  "9780000000005|Microservicios con Java|Sofía Castillo"
  "9780000000006|Introducción a PostgreSQL|Daniel Flores"
  "9780000000007|Bases de Datos Relacionales|Mariana López"
  "9780000000008|Algoritmos y Estructuras de Datos|Roberto Silva"
  "9780000000009|Patrones de Diseño en Java|Elena Vargas"
  "9780000000010|Desarrollo Web Moderno|Fernando Cruz"
  "9780000000011|APIs REST con Spring|Gabriela Reyes"
  "9780000000012|Hibernate y JPA|Alejandro Morales"
  "9780000000013|Clean Architecture|Martin Fowler"
  "9780000000014|Código Limpio para Principiantes|Robert Martin"
  "9780000000015|Git y GitHub Profesional|Lucía Navarro"
  "9780000000016|Docker para Desarrolladores|Jorge Sánchez"
  "9780000000017|Linux para Programadores|Patricia Romero"
  "9780000000018|Fundamentos de Redes|Ricardo Aguilar"
  "9780000000019|Seguridad Informática|Natalia Campos"
  "9780000000020|Pruebas Unitarias con JUnit|Andrés Ortega"
  "9780000000021|Maven y Gestión de Proyectos|Claudia Ríos"
  "9780000000022|Programación Orientada a Objetos|Héctor Medina"
  "9780000000023|Introducción a Kotlin|Valeria Vega"
  "9780000000024|Desarrollo de Microservicios|Eduardo Paredes"
  "9780000000025|Computación en la Nube|Mónica Salazar"
  "9780000000026|Inteligencia Artificial Aplicada|Diego Herrera"
  "9780000000027|Python para Ciencia de Datos|Paola Jiménez"
  "9780000000028|Angular y Spring Boot|Emilio Caballero"
  "9780000000029|React para Principiantes|Sandra Fuentes"
  "9780000000030|DevOps y Entrega Continua|Arturo Molina"
)

created=0
failed=0

for book in "${books[@]}"; do
  IFS="|" read -r isbn title author <<< "$book"

  payload=$(printf \
    '{"isbn":"%s","title":"%s","author":"%s"}' \
    "$isbn" "$title" "$author")

  response=$(curl --silent \
    --request POST "$API_URL" \
    --header "Content-Type: application/json" \
    --data "$payload" \
    --write-out $'\n%{http_code}')

  body="${response%$'\n'*}"
  status="${response##*$'\n'}"

  if [[ "$status" -ge 200 && "$status" -lt 300 ]]; then
    echo "✓ Creado: $title"
    ((created++))
  else
    echo "✗ Error al crear: $title (HTTP $status)"
    echo "  Respuesta: $body"
    ((failed++))
  fi
done

echo
echo "Proceso terminado"
echo "Libros creados: $created"
echo "Errores: $failed"