package com.example.Instructify.Model;


import com.example.Instructify.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Documents")
public class Document {

    @Id
    @SequenceGenerator(name="Document_sequence",
            sequenceName = """
                    """,
            allocationSize = 1
    )

    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "Document_generator"
    )
    @Column(name="document_id")
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_instructor_id")
    private Instructor instructor;

    @Column(name="file")
    private byte[] file;

    @Column(name= "File_type")
    private String fileType;












}
