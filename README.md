# Cuestiones de análisis
## 1. ¿Qué tipo de relación se define en el diagrama UML entre Pedido y Producto?
### Una composición, porque en el digrama se usa el simbolo "*--" desde pedido hacia producto. En el que pedido es el todo y producto es una parte del pedido.
## 2. ¿Qué significa la cardinalidad indicada en esa relación?
### Un pedio puede contener 0 o varios productos y cada producto pertenece a un solo pedido.
## 3. ¿Qué otros tipos de cardinalidad se pueden definir en UML?
### 1..1:
- persona 1..1 ---- 1..1 DNI
#### Cada persona tiene un Único DNI y cada DNI pertenece a una sola persona.
### 1..*:
- Curso 1..* --- Estudiante
#### Un curso puede tener 1 o varios estudiantes.
### *:
- Autor *---* Libro
#### Un autor puede escribir varios libros y un libro puede tener varios autores.
## 4. ¿Qué diferencias existen entre una asociación, una agregación y una composición?
- Asociacón: relación más general, indica que una clase conoce o usa a otra
- Agragación: una forma especial de asociación, representa una relación todo--parte débil y las partes pueden existir aunque el "todo" desaparezca.
- Composición: una forma más fuerte de la agregación, un todo--parte fuerte u las partes no existen si en "todo".
